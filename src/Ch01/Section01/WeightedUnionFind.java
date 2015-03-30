package Ch01.Section01;

import java.util.Arrays;

/**
 * Created on 30.03.2015.
 */

public class WeightedUnionFind {
    int[] nodes;
    int[] weights;
    int numberOfUnions;

    public WeightedUnionFind(int numberOfElements){
        nodes = new int[numberOfElements];
        weights = new int[numberOfElements];
        numberOfUnions = numberOfElements;
        _initializeNodes();
        Arrays.fill(weights, 1);
    }
    private void _initializeNodes(){
        for (int i = 0; i < nodes.length; i++){
            nodes[i] = i;
        }
    }

    public int Find(int nodeId){
        while(nodeId != nodes[nodeId]) {
            nodeId = nodes[nodeId];
        }
        return nodeId;
    }
    public void Union(int firstNodeId, int secondNodeId){

        if(firstNodeId == secondNodeId) { return; }

        int firstRootNodeId = Find(firstNodeId);
        int secondRootNodeId = Find(secondNodeId);

        if(weights[firstNodeId] <= weights [secondNodeId]) {
            nodes[firstRootNodeId] = nodes[secondRootNodeId];
            weights[secondRootNodeId] = weights[secondRootNodeId] + weights[firstRootNodeId];
        }
        else {
            nodes[secondRootNodeId] = nodes[firstRootNodeId];
            weights[firstRootNodeId] = weights[firstRootNodeId] + weights[secondRootNodeId];
        }

        numberOfUnions = numberOfUnions - 1;
    }
    public void PrintNodes(){
        System.out.println();
        System.out.print("N ");
        for (int i = 0; i < nodes.length; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("I ");
        for (int i = 0; i < nodes.length; i++){
            System.out.print(nodes[i] + " ");
        }
        System.out.println();
        System.out.print("W ");
        for (int i = 0; i < nodes.length; i++){
            System.out.print(weights[i] + " ");
        }
    }
}
