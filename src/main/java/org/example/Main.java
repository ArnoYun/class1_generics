package org.example;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue1 = new Queue<String>();
        Queue<Integer> queue2 = new Queue<Integer>();

        queue1.add("string1");
        queue1.add("string2");
        queue1.add("string3");

        queue2.add(1);
        queue2.add(2);
        queue2.add(3);

        queue1.print();
        queue2.print();

        queue1.getHead();
        queue2.getHead();

        queue1.remove();
        queue2.remove();

        queue1.getHead();
        queue2.getHead();

    }
}