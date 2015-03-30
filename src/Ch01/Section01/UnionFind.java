package Ch01.Section01;

/**
 * Created on 30.03.2015.
 */
public class UnionFind {
    int[] nodes;
    int numberOfUnions;

    public UnionFind(int numberOfElements)
    {
        nodes = new int[numberOfElements];
        numberOfUnions = numberOfElements;
        _initializeNodes();
    }
    private void _initializeNodes(){
        for (int i = 0; i < nodes.length; i++){
            nodes[i] = i;
        }
    }

    public void PrintNodes(){
        System.out.println();
        for (int i = 0; i < nodes.length; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < nodes.length; i++){
            System.out.print(nodes[i] + " ");
        }
    }
    public int Find(int nodeId){
        while(nodeId != nodes[nodeId]) {
            nodeId = nodeId;
        }
        return nodeId;
    }
    public void Union(int firstNodeId, int secondNodeId){

        if(firstNodeId == secondNodeId) { return; }

        int firstRootNode = Find(firstNodeId);
        int secondRootNode = Find(secondNodeId);

        nodes[firstNodeId] = nodes[secondNodeId];
        numberOfUnions = numberOfUnions - 1;
    }

    public void Test(){
        WeightedUnionFind uf = new WeightedUnionFind(9);
        uf.PrintNodes();
        System.out.println("*1*");

        uf.Union(2, 5);
        uf.Union(7, 5);
        uf.Union(8, 5);
        uf.PrintNodes();

        System.out.println("*2*");
        uf.Union(6, 3);
        uf.Union(0, 1);
        uf.PrintNodes();

        System.out.println("*3*");
        uf.Union(1, 3);
        uf.Union(4, 7);
        uf.PrintNodes();

        System.out.println("*4*");
        uf.Union(1, 8);
        uf.PrintNodes();
    }
}
