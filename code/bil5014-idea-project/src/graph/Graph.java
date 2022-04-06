package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Graph {
    private String type;
    private Set<String> vertex;
    private Set<String> edge;
    private ArrayList<String>[] arrayOfQueue;

    public Graph(String type, Set<String> vertex, Set<String> edge) {
        this.type = type;
        this.vertex = vertex;
        this.edge = edge;
        arrayOfQueue = new ArrayList[vertex.size()];

        int i = 0;
        for (String v : vertex) {
            arrayOfQueue[i] = new ArrayList<>();
            arrayOfQueue[i].add(v);
            i++;
        }

        for (ArrayList q : arrayOfQueue) {
            for (String pair : edge) {
                String[] temp = pair.split("-");
                String v1 = temp[0];
                String v2 = temp[1];
                if (v1.equals(q.get(0))) q.add(v2);
            }
        }
    }

    public int inDegree(String s) {
        int c = 0;
        for (String pair : edge) {
            String[] temp = pair.split("-");
            String v1 = temp[0];
            String v2 = temp[1];
            if (s.equals(v2)) c++;
        }
        return c;
    }

    public int outDegree(String s) {
        int c = 0;
        for (String pair : edge) {
            String[] temp = pair.split("-");
            String v1 = temp[0];
            String v2 = temp[1];
            if (s.equals(v1)) c++;
        }
        return c;
    }
}