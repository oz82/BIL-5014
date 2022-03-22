package heap;

public class TestZero {
    public static void main(String[] args) {
        Zero z1 = new Zero(new Integer[] {null, 3, 8, 4, 5});
        System.out.println("min:\t" + z1.findMin());
        System.out.println(z1);
        z1.deleteMin();
        System.out.println(z1);
    }
}