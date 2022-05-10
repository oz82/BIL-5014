//package graph;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class TestGraph {
//    public static void main(String[] args) {
//        Set<String> set1 = new HashSet<>();
//        set1.add("A");
//        set1.add("B");
//        set1.add("C");
//        set1.add("D");
//        set1.add("E");
//
//        Set<String> set2 = new HashSet<>();
//        set2.add("A-B");
//        set2.add("A-C");
//        set2.add("B-E");
//        set2.add("B-D");
//        set2.add("D-C");
//        set2.add("E-C");
//
//        Graph g1 = new Graph("", set1, set2);
//        System.out.println(g1.inDegree("A"));
//        System.out.println(g1.inDegree("B"));
//        System.out.println(g1.inDegree("C"));
//        System.out.println(g1.inDegree("D"));
//        System.out.println(g1.inDegree("E"));
//    }
//}