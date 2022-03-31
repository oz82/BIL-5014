package heap;

public class TestMinHeap2 {
    public static void main(String[] args) {
//        MinHeap2 z1 = new MinHeap2(new Integer[] {null, 3, 8, 4, 5});
//        System.out.println("min:\t" + z1.findMin());
//        System.out.println(z1);
//        z1.deleteMin();
//        System.out.println(z1);
//        z1.insert(2);
//        System.out.println(z1);
//        z1.insert(1);
//        System.out.println(z1);

        MinHeap2 mh2 = new MinHeap2();
        mh2.buildHeap(new Integer[] {null, 20, 6, 3, 10, 16, 2, 10, 14, 8, 7});
        System.out.println(mh2);
    }
}