package com.example.mypackage;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue("Alice");
        queue.enqueue("Bob");
        queue.enqueue("Charlie");
        queue.enqueue("David");
        queue.enqueue("Eve");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue("Felbert");
    }
}
