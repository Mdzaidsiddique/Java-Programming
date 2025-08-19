package com.temp;

import java.util.PriorityQueue;

public class TempClass {

    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.add(1);
        q.add(4); // add: Throws IllegalStateException if capacity full
        q.offer(9); // instead of throwing exception it returns false
        q.add(3);

        System.out.println(q);
    }
}
