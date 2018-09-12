package array;

public class Array {
    private int[] data;
    private int size;

    public Array(int capacity) {
        data = new int[capacity];
    }

    public Array() {
        this(20);
    }

}
