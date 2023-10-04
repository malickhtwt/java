package dsa.Graph;

public class Main {
    public static void main(String[] args) {
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addEdge("A","B");
        myGraph.addEdge("B","A");
        myGraph.addEdge("C","A");
        myGraph.addEdge("A","C");
        myGraph.removeVertex("A");
        System.out.println(myGraph.dataGraph);


    }
}
