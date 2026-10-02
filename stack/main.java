
class main {
    private String[] items;
    private int top;
    private int capacity;

    public main(int capacity) {
        this.capacity = capacity;
        this.items = new String[capacity];
        this.top = -1;
    }

    public void push(String n) {
        if (isFull()) {
            System.out.println("stack overflow");
            return;
        }
        this.top++;
        this.items[top] = n;
        return;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("stack underflow");
            return;
        }
        this.items[top] = null;
        top--;
        return;
    }

    private boolean isEmpty() {
        return this.top == -1;
    }

    private boolean isFull() {
        return this.top + 1 == capacity;
    }

    public String peek() {
        return this.items[this.top];
    }

    public static void main(String[] args) {
        main m = new main(5);
        m.push("felbert");
        m.push("amefa");
        m.push("felix");
        m.push("eloise");
        m.push("adelien");
        System.out.println(m.peek());
        m.push("owen");

    }
}
