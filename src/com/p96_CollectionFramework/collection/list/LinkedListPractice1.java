package com.p96_CollectionFramework.collection.list;

import java.util.LinkedList;

public class LinkedListPractice1 {

    public void linkedListOperations(LinkedList linkedList){

        /*
        add(E e)                      // Adds element to end of list
        add(int index, E element)     // Adds element at specific position
        get(int index)                // Returns element at specified index
        set(int index, E element)     // Replaces element at specified index
        remove(int index)             // Removes element at specific index
        remove(Object o)              // Removes first occurrence of specified element
        indexOf(Object o)             // Returns first index of element, or -1
        lastIndexOf(Object o)         // Returns last index of element
        size()                        // Returns number of elements in the list
        clear()                       // Removes all elements from the list
        contains(Object o)            // Returns true if element is found
        isEmpty()                     // Checks if the list is empty
        */
    }

    public void dequeOperation(){
        /* Deque (double-ended queue) operations
        addFirst(E e)                 // Inserts element at the beginning
        addLast(E e)                  // Inserts element at the end
        getFirst()                    // Retrieves first element (throws exception if empty)
        getLast()                     // Retrieves last element
        removeFirst()                 // Removes and returns first element
        removeLast()                  // Removes and returns last element
        offerFirst(E e)               // Adds element to beginning (returns false if fails)
        offerLast(E e)                // Adds element to end
        peekFirst()                   // Retrieves first element or null if empty
        peekLast()                    // Retrieves last element or null if empty
        pollFirst()                   // Removes and returns first element or null
        pollLast()                    // Removes and returns last element or null
        */
    }

    public void queueOperation(){
        /*
        offer(E e)                    // Inserts element at end of queue
        poll()                        // Retrieves and removes head of queue
        peek()                        // Retrieves head without removing
        */
    }

    public void iteratorRelated(){
        /*
        iterator()                    // Returns an iterator over the elements
        listIterator()                // Returns a list iterator
        descendingIterator()          // Iterator from end to start
         */
    }

    public void miscellaneous(){
        /*
        clone()                       // Returns shallow copy of the list
        toArray()                     // Converts list to array
        */

    }


    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>(); // there is no concept of capacity
        linkedList.add("one"); // add in the end
        linkedList.add("two");
        linkedList.add(null);
        linkedList.add(1, "three"); // add at sp position
        linkedList.set(3, "four"); // replace

        String one = linkedList.get(0); // get element of sp index

        linkedList.size(); // return size

        System.out.println(linkedList + one);

    }
}
