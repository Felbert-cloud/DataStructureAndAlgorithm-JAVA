class MyList {
    private int[] data;
    private int size;

    public MyList() {
        data = new int[10];
        size = 0;
    }

    public void add(int value) {
        if (size == data.length) {
            resize();
        }
        data[size] = value;
        size += 1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int remove(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        int removed = data[index];

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        size--;
        return removed;
    }

    private void resize() {
        int[] newData = new int[data.length * 2];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.print();
    }
}
