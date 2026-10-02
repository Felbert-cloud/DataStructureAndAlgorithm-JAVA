package com.example.mypackage;

public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertHead(int n) {
        if (isTailOrHeadNull()) {
            initialInsert(n);
            return;
        }
        Node lasthead = this.head;// get the lasthead
        this.head = new Node(n, lasthead);// override the head with the new node and refference the last node
    }

    public void insertSpecify(int index, int value) {
        if (index < 0) {
            return;
        }
        Node newNode = new Node(value, null);
        Node current = this.head;
        Node prev = null;
        for (int i = 0; current != null; i++) {
            if (i == index) {
                prev.next = newNode;
                newNode.next = current;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    private void initialInsert(int n) {
        this.head = new Node(n, null);
        this.tail = this.head;
        return;
    }

    public Node insertAfterTail(int n) {
        if (isTailOrHeadNull()) {
            initialInsert(n);
            return null;
        }
        Node newTail = new Node(n, null);
        this.tail.next = newTail;
        this.tail = newTail;
        return this.tail;
    }

    private boolean isTailOrHeadNull() {
        return this.head == null || this.tail == null;
    }

    public boolean search(int n) {
        Node current = this.head;
        while (current != null) {
            if (current.data == n) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void print() {
        Node current = this.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public Node removeTail() {
        // find the node that have next value of null;
        Node current = this.head;
        Node prev = null;
        for (int i = 0; current != null; i++) {
            if (current.next == null) {
                prev.next = null;
                this.tail = prev;
                return this.tail;
            }
            prev = current;
            current = current.next;
        }
        return null;

    }

    public Node remove(int index) {
        if (index < 0 || head == null) {
            return null;
        }

        if (index == 0) {
            this.head = this.head.next;
            return null;
        }

        Node current = this.head;
        Node previous = null;
        for (int i = 0; current != null; i++) {
            if (index - 1 == i) {
                previous = current;
            }

            if (i == index) {
                previous.next = current.next;
                return current;
            }
            current = current.next;
        }
        return null;

    }

}
