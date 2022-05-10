package graph;

import java.util.*;

public class Graph {
    private String type;
    private HashMap<String, Integer> mapLabelID;
    private HashMap<Integer, String> mapIDLabel;
    private int[] inDegree;
    private int[] outDegree;
    private ArrayList<Integer>[] data;
    private int numVertex;

    public Graph(String type, String v, String e) {
        this.type = type;
        mapLabelID = new HashMap<>();
        mapIDLabel = new HashMap<>();
        String[] vArr = v.split(",");
        String[] eArr = e.split(",");

        int index = 0;
        for (String s : vArr) {
            if (mapLabelID.get(s) != null) {
                System.out.println("Redundant vertex!");
                System.exit(1);
            }
            mapLabelID.put(s, index);
            mapIDLabel.put(index, s);
            index++;
        }
        numVertex = index;

        data = new ArrayList[numVertex];
        for (int i = 0; i < numVertex; i++) {
            data[i] = new ArrayList<>();
        }

        for (String s : eArr) {
            String[] edgeArr = s.split("-");
            String left = edgeArr[0];
            String right = edgeArr[1];
            data[mapLabelID.get(left)].add(mapLabelID.get(right));
        }

        inDegree = new int[numVertex];
        outDegree = new int[numVertex];
        for (int i = 0; i < numVertex; i++) {
            outDegree[i] = data[i].size();
            ArrayList<Integer> list = data[i];
            for (Integer item : data[i]) {
                inDegree[item]++;
            }
        }
    }

    public int inDegree(String vertex) {
        return inDegree[mapLabelID.get(vertex)];
    }

    public int outDegree(String vertex) {
        return outDegree[mapLabelID.get(vertex)];
    }
}