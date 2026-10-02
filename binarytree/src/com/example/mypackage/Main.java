package com.example.mypackage;

import com.example.mypackage.Tree;
import com.example.mypackage.Node;

class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(98);
        tree.insert(41);
        tree.insert(40);
        tree.insert(64);
        tree.insert(38);
        tree.insert(100);
        tree.insert(85);
        tree.print();
        System.out.println();
        tree.remove(64);
        System.out.println("removing 100...");
        tree.print();

    }

}
