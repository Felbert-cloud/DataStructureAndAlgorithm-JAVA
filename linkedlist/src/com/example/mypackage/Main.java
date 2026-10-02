package com.example.mypackage;

import com.example.mypackage.LinkedList;
import com.example.mypackage.Node;

public class Main {

    public static void main(String[] args) {
        LinkedList linklist = new LinkedList();
        linklist.insertHead(10);
        linklist.insertHead(20);
        linklist.insertHead(30);
        linklist.insertHead(700);

        linklist.print();

        linklist.remove(2);

        System.out.println();

        linklist.print();

        System.out.println();

        linklist.insertAfterTail(200);

        linklist.print();

        System.out.println();

        linklist.insertSpecify(1, 999);

        linklist.print();

        System.out.println("removing tail");

        linklist.removeTail();

        linklist.print();
    }

}
