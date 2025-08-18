package com.p96_CollectionFramework.collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    /*
    - PriorityQueue is a queue where elements are served based on priority (not insertion order).
    - Internally uses a heap.
    - By default: min-heap; for max-heap/custom, use Comparator.
    */
    public static void main(String[] args) {

        Queue<Integer> q = new PriorityQueue<>();
        q.add(5);
        q.add(4);
//        System.out.println(q.peek()); //4

        // Default Priority (Natural Ordering)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.offer(6);
        pq.add(4);
        pq.add(4);

        System.out.println(pq);

        // Max-Heap using Comparator
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());

        pq2.add(40);
        pq2.add(50);
        pq2.add(30);
        pq2.add(20);

        System.out.println(pq2);

        // peek() → Retrieves the head element but does NOT remove it
        // poll() → Retrieves the head element and removes it from the queue
    }
}
