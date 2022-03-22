package heap;

public class MinHeap {
    private Integer[] data;

    public MinHeap(Integer[] data) {
        this.data = data;
    }

//    public MinHeap(int n) {
//        data = new Integer[n];
//        for (int i = 0; i < n; i++) {
//            data[i] = Math.random()
//        }
//    }

    @Override
    public String toString() {
        String result = "";
        for (Integer x : data) {
            result += x + " ";
        }
        return result;
    }

    public Integer getRoot() {
        if (data.length < 2) return null;
        return data[1];
    }

    public void setRoot(Integer x) {
        if (data.length > 1) data[1] = x;
    }

    public Integer getEnd() {
        return data[data.length - 1];
    }

    public void setEnd(Integer x) {
        if (data.length > 2) data[data.length - 1] = x;
    }

    public int[] getChildren(int indexParent) {
        int[] result = new int[2];
        if (2 * indexParent < data.length) result[0] = 2 * indexParent;
        if (2 * indexParent + 1 < data.length) result[1] = 2 * indexParent + 1;
        return result;
    }

    public void heapify(int indexParent) {
        int[] child = getChildren(indexParent);
        if (child[0] == 0 && child[1] == 0) return;

        int indexMinChild = 0;
        if (child[0] == 0) indexMinChild = child[1];
        else if (child[1] == 0) indexMinChild = child[0];
        else if (data[child[0]] < data[child[1]]) indexMinChild = child[0];
        else indexMinChild = child[1];

        Integer temp = data[indexParent];
        data[indexParent] = data[indexMinChild];
        data[indexMinChild] = temp;

        heapify(indexMinChild);
    }

    public Integer findMin() {
        return getRoot();
    }

    public void deleteMin() {
        if (data.length < 3) {
            setRoot(null);
            return;
        }
        setRoot(getEnd());
        setEnd(null);
        heapify(1);
    }
}
