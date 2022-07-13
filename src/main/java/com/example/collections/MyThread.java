package com.example.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyThread extends Thread {
    static List<String> l = new ArrayList<>();

    //static List<String> l = new CopyOnWriteArrayList<>();
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Child thread updating list");
        l.add("D");
    }

    public static void main(String[] args) throws InterruptedException {
        l.add("A");
        l.add("B");
        l.add("C");
        MyThread t = new MyThread();
        t.start();
        for (String str : l) {
            System.out.println("Main thread iterating list and current value is: " + str);
            Thread.sleep(3000);
        }
        System.out.println(l);
    }
}
