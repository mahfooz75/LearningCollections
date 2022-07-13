package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationDemo {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("a");
        lst.add("b");
        lst.add("c");
        lst.add("d");
        lst.add("e");

        Iterator<String> itr = lst.iterator();
        while (itr.hasNext()) {
            String s = itr.next();
            System.out.print(s + " ");
            //lst.add("f"); // Concurrent Modification Exception
        }
        System.out.println();
        List<String> conList = new CopyOnWriteArrayList<>();
        conList.add("a");
        conList.add("b");
        conList.add("c");
        conList.add("d");
        conList.add("e");

        for (String str : conList) {
            System.out.print(str + " ");
            conList.add("f");
        }
    }
}
