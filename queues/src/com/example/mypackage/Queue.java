package com.example.mypackage;

public class Queue {

    private String[] items;
    private int front;
    private int rear;
    private int capacity;

    // Constructor
    public Queue(int capacity) {
        this.items = new String[capacity];
        this.capacity = capacity;
        this.front = -1;
        this.rear = -1;
        // TODO: initialize fields
    }

    // Add an element to the queue
    public void enqueue(String str) {
        System.out.println("enqueue");
        if (this.isFull()) {
            System.out.println("the queue is full");
            return;
        }
        if (this.isEmpty()) {
            front++;
            rear++;
            this.items[rear] = str;
            display();
            return;
        }
        rear++;
        this.items[rear] = str;
        display();
        return;
    }

    // Remove an element from the queue
    public void dequeue() {
        System.out.println("dequeue");
        if (this.isEmpty()) {
            System.out.println("the queue is empty");
            return;
        }
        if (isFull()) {
            if (front >= rear) {
                reset();
                return;
            }
        }
        items[front] = null;
        front++;
        display();
        return;
    }

    // Look at the front element without removing it
    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return items[front];
    }

    // Check if the queue is empty
    private boolean isEmpty() {
        return front <= -1 && rear <= -1;
    }

    private void reset() {
        System.out.println("reset");
        this.front = -1;
        this.rear = -1;
        System.out.println("front:" + front + "rear :" + rear);
    }

    // Check if the queue is full
    public boolean isFull() {
        if (this.capacity == this.rear + 1) {
            return true;
        }
        return false;
    }

    // Display queue contents
    public void display() {

        for (int i = front; i <= rear; i++) {
            System.out.print(items[i]);
            System.out.println();
        }
        System.out.println();
        // // TODO
    }
}
