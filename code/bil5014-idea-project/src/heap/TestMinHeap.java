package heap;

public class TestMinHeap {
    public static void main(String[] args) {
        MinHeap myHeap = new MinHeap(new Integer[]{null, 2, 4, 7, 5, 8, 10, 12});
        System.out.println(myHeap);
        myHeap.deleteMin();
        System.out.println(myHeap);
    }
}
