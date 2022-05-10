package graph;

import java.util.Stack;

public class BFS {
    private static String[] color;
    private static int[] d;
    private static String[] pred;
    private static Stack<String> st;
    // A
    public static String[] bfs(Graph g, String s) {
        int n = g.data.length;
        color = new String[n];
        d = new int[n];
        pred = new String[n];
        for (int i = 0; i < n; i++) {
            if (g.mapLabelID.get(s) == i) continue;
            color[i] = "white";
            d[i] = Integer.MAX_VALUE;
            pred[i] = "null";
        }
        color[g.mapLabelID.get(s)] = "gray";
        d[g.mapLabelID.get(s)] = 0;
        pred[g.mapLabelID.get(s)] = "null";
        st = new Stack<>();
        st.add(s);

        while (!st.isEmpty()) {
            String u = st.pop();
            int uInt = g.mapLabelID.get(u);
            for (int vInt : g.data[uInt]) {
                String v = g.mapIDLabel.get(vInt);
                if (color[vInt].equals("white")) {
                    color[vInt] = "gray";
                    d[vInt] = d[uInt] + 1;
                    pred[vInt] = u;
                    st.add(v);
                }
            }
            color[uInt] = "black";
        }
        return pred;
    }
}