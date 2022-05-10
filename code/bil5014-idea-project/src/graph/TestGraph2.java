package graph;

public class TestGraph2 {
    public static void main(String[] args) {
        //Graph g1 = new Graph("", "A,B,C,D,E,F,G", "A-B,A-D,A-E,B-C,B-G,C-F,D-E,D-F,D-G,E-G");
        Graph g1 = new Graph("", "A,B,C,D,E", "A-B,A-C,A-E,B-D,C-D,E-D");

        for (Integer v_ : BFS.bfs(g1, "A")) {
            System.out.println(v_);
        }
    }
}