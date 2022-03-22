package heap;

import java.util.Arrays;

public class Zero {
    private Integer[] data;

    public Zero(Integer[] data) {
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

        if (data[child1] < data[child2]) minChild = child1;
        else minChild = child2;

        Integer temp = data[index];
        data[index] = data[minChild];
        data[minChild] = temp;

        heapify(minChild);
    }
}
