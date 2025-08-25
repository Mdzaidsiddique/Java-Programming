package com.p19_CollectionFramework.collection.list;

import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(1);

        System.out.println(stack);

        stack.pop();

        stack.peek();

        int size = stack.size();
        System.out.println(size);

        stack.search(1);

    }
}
