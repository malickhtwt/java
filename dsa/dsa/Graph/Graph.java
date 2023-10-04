package dsa.Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph {
    HashMap<String, ArrayList<String>> dataGraph;

    public Graph() {
        this.dataGraph = new HashMap<>();
    }

    public boolean addVertex(String vertex) {
        if (this.dataGraph.get(vertex) == null) {
            this.dataGraph.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String vertex, String edge) {
        if (this.dataGraph.keySet().contains(edge) && (vertex != edge)) {
            List vertexList = this.dataGraph.get(vertex);
            if (!vertexList.contains(edge)) {
                vertexList.add(edge);
            }
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex, String edge) {
        if (this.dataGraph.keySet().contains(edge) && (vertex != edge)) {
            List vertexList = this.dataGraph.get(vertex);
            if (vertexList.contains(edge)) {
                vertexList.remove(edge);
            }
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex){
        for (String val: this.dataGraph.get(vertex)) {
            List otherVertexList = this.dataGraph.get(val);
            otherVertexList.remove(vertex);
        }
        this.dataGraph.remove(vertex);
        return false;
    }
}
