package com.example.mypackage;

public class Node {

    int data;
    Node next;
    String description;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data, Node next, String description) {
        this.data = data;
        this.next = next;
        this.description = description;
    }

}
