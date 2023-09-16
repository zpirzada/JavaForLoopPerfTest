

package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Integer> mylist = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            mylist.add(i);
        }

        System.out.println("Performance Test between For and ForEach Loop for ArrayList = "+ mylist.size());
        long forLoopStartTime = System.currentTimeMillis();
        for (int i = 0; i < mylist.size(); i++) {mylist.get(i);}

        long forLoopTraversalCost =System.currentTimeMillis()-forLoopStartTime;
        System.out.println("for loop traversal cost for ArrayList= "+ forLoopTraversalCost);

        long forEachStartTime = System.currentTimeMillis();
        for (Integer integer : mylist) {}

        long forEachTraversalCost =System.currentTimeMillis()-forEachStartTime;
        System.out.println("foreach traversal cost for ArrayList= "+ forEachTraversalCost);




    }
}