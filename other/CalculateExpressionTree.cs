using System;

namespace ConsoleApplication2
{
    abstract class Node
    {
        public Node Left  { get; set; }
        public Node Right { get; set; }
    }
    class OperationNode : Node
    {
        public OperationNode(Func<int, int, int> operation)
        {
            this.Operation = operation;
        }
        private readonly Func<int, int, int> Operation;

        public int Calculate(int a, int b)
        {
            return Operation(a, b);
        }
    }

    class OperandNode : Node
    {
        public OperandNode(int value)
        {
            this.Value = value;
        }
        public int Value { get; private set; }
    }

    abstract class Algorithms
    { 
        public static int CalculateExpressionTree(Node node)
        {
            if (node is OperandNode)
            {
                return (node as OperandNode).Value;
            }

            return 
                (node as OperationNode)
                .Calculate(
                    CalculateExpressionTree(node.Left),
                    CalculateExpressionTree(node.Right)
                );
        }
    }


    class Program
    {
        static void Main(string[] args)
        {
            var root = new OperationNode((a, b) => a + b)
            {
                Left = new OperationNode((a, b) => a * b)
                {
                    Left = new OperandNode(3),
                    Right = new OperationNode((a,b) => a - b)
                    {
                        Left = new OperandNode(1),
                        Right = new OperandNode(2)
                    }
                },
                Right = new OperandNode(4),
            };

            System.Console.WriteLine(Algorithms.CalculateExpressionTree(root));

            System.Threading.Thread.Sleep(3000);
        }
    }
}
