package org.example;

import java.util.ArrayList;

public class Queue<T> {
    private ArrayList<T> queue = new ArrayList<T>();
    private T head;
    private T back;

    public void add(T element){
        this.queue.add(element);
        this.back = queue.get(queue.size()-1);
    }

    public void print(){
        if(this.queue.size()!=0) {
            for (T t : this.queue) {
                System.out.println(t);
            }
        }
        else {
            System.out.println("Queue is empty");
        }
    }

    public void getBack(){
        System.out.println("Back element "+back);
    }

    public void getHead(){
        this.head = queue.get(0);
        System.out.println("Head element "+head);
    }

    public void remove(){
        this.queue.remove(0);
        if(queue.size() <= 0){
            System.out.println("Queue is empty");
            this.back = null;
        }
        else {
            this.head = queue.get(0);
        }
    }


}
