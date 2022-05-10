package graph;

public class TestGraph2 {
    public static void main(String[] args) {
        Graph g1 = new Graph("", "A,B,C,D,E,F,G", "A-B,A-D,A-E,B-C,B-G,C-F,D-E,D-F,D-G,E-G");
        System.out.println(g1.inDegree("A"));
        System.out.println(g1.inDegree("B"));
        System.out.println(g1.inDegree("C"));
        System.out.println(g1.inDegree("D"));
        System.out.println(g1.inDegree("E"));
        System.out.println(g1.inDegree("F"));
        System.out.println(g1.inDegree("G"));
    }
}