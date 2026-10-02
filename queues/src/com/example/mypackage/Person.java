package com.example.mypackage;

public class Person {
    String name;
    String age;
    String address;

    public Person(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void Introduce() {
        System.out.println("Hello I am " + name + " and I am " + this.age + " years old" + " and I am from "
                + address);
    }
}
