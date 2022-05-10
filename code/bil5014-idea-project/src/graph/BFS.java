package graph;

import java.util.Stack;

public class BFS {
    private static String[] color;
    private static int[] d;
    private static Integer[] pred;
    private static Stack<Integer> st;

    public static Integer[] bfs(Graph g, String source) {
        Integer s = g.mapLabelID.get(source);

        int n = g.data.length;
        color = new String[n];
        d = new int[n];
        pred = new Integer[n];

        for (int i = 0; i < n; i++) {
            if (s == i) continue;
            color[i] = "white";
            //d[i] = Integer.MAX_VALUE;
            pred[i] = null;
        }
        color[s] = "gray";
        d[s] = 0;
        pred[s] = null;
        st = new Stack<>();
        st.add(s);

        while (!st.isEmpty()) {
            Integer u = st.pop();
            for (int v : g.data[u]) {
                if (color[v].equals("white")) {
                    color[v] = "gray";
                    d[v] = d[u] + 1;
                    pred[v] = u;
                    st.add(v);
                }
            }
            color[u] = "black";
        }
        return pred;
    }
}