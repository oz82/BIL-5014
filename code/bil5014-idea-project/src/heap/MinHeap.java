package heap;

public class MinHeap {
    private Integer[] data;

    public MinHeap() {
    }

    public MinHeap(Integer[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        String result = "";
        for (Integer x : data) {
            result += x + "\t";
        }
        return result;
    }

    public Integer findMin() {
        return getRoot();
    }

    private Integer getRoot() {
        return data[1];
    }

    private void setRoot(Integer x) {
        data[1] = x;
    }

    private Integer getEnd() {
        return data[data.length - 1];
    }

    private void setEnd(Integer x) {
        data[data.length - 1] = x;
    }

    public void deleteMin() {
        setRoot(getEnd());
        setEnd(null);
        heapify(1);
    }

    private void heapify(int index) {
        int child1 = 2 * index;
        int child2 = 2 * index + 1;
        int minChild;

        if ((child1 > data.length - 1 || data[child1] == null) && (child2 > data.length - 1 || data[child2] == null)) return;
        else if (child1 > data.length - 1 || data[child1] == null) minChild = child2;
        else if (child2 > data.length - 1 || data[child2] == null) minChild = child1;
        else if (data[child1] < data[child2]) minChild = child1;
        else minChild = child2;

        Integer temp = data[index];
        data[index] = data[minChild];
        data[minChild] = temp;

        heapify(minChild);
    }

    private void expand() {
        Integer[] copy = new Integer[data.length * 2];
        System.arraycopy(data, 0, copy, 0, data.length);
        data = copy;
    }

    public void insert(Integer item) {
        int i = data.length - 1;

        if (data[i] != null) {
            expand();
        }

        while (data[i] == null) {
            i--;
        }
        i = i + 1;

        data[i] = item;

        while (i > 1) {
            if (data[i / 2] > data[i]) {
                Integer temp = data[i];
                data[i] = data[i / 2];
                data[i / 2] = temp;
            } else break;
            i = i / 2;
        }
    }

    public void buildHeap(Integer[] input) {
        data = input;
        int i = data.length / 2;
        while (i >= 1) {
            heapify(i);
            i--;
        }
    }
}