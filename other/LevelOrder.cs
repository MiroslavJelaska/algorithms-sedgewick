using System.Collections.Generic;
using System.Globalization;
using System.Linq;

namespace ConsoleApplication2
{
    class Node<T>
    {
        public Node(int value)
        {
            this.Value = value;
        }

        public int     Value { get; private set; }
        public Node<T> Left  { get; set; }
        public Node<T> Right { get; set; }

        public override string ToString()
        {
            return this.Value.ToString(CultureInfo.InvariantCulture);
        }
    }
    class BinaryTree <T>
    {
        private Queue<Node<T>> NodesForPrint = new Queue<Node<T>>();
        public void PrintLevelOrder(Node<T> node)
        {
            System.Console.WriteLine(node);
            
            AddChildrenForPrint(node, NodesForPrint);
            
            var nextNodesForPrint = new Queue<Node<T>>();
            while(NodesForPrint.Any())
            {
                while (NodesForPrint.Any())
                {
                    var currentNode = NodesForPrint.Dequeue();
                    System.Console.WriteLine(currentNode);
                    AddChildrenForPrint(currentNode, nextNodesForPrint);
                }
                NodesForPrint = nextNodesForPrint;
            }
        }
        void AddChildrenForPrint(Node<T> node, Queue<Node<T>> queue)
        {
            if (node.Left != null)
            {
                queue.Enqueue(node.Left);
            }
            if (node.Right != null)
            {
                queue.Enqueue(node.Right);
            }
        }
    }


    class Program
    {
        static void Main(string[] args)
        {
            var n1 = new Node<int>(1);

            var n2 = new Node<int>(2);
            var n3 = new Node<int>(3);
            
            var n4 = new Node<int>(4);
            var n5 = new Node<int>(5);
            var n6 = new Node<int>(6);

            n1.Left = n2;
            n1.Right = n3;

            n2.Left = n4;
            n3.Left = n5;
            n3.Right = n6;

            var binTree = new BinaryTree<int>();
            binTree.PrintLevelOrder(n1);

            System.Threading.Thread.Sleep(3000);
        }
    }
}
