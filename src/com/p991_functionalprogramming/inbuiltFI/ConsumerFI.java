package com.p991_functionalprogramming.inbuiltFI;

import com.p991_functionalprogramming.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFI {

    // java.util.function.Consumer<T> - public void accept(T t);
    // only an abstract method accept(T t) -> takes one args but don't return any value

    public static void main(String[] args) {

        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        consumer.accept("zaid alif"); //ZAID ALIF

        // In java 8, The Iterable<T> interface defines following method
        // default void forEach(Consumer<? super T> action)
        // it performs the given action for each element of the Iterable until all elements have
        // been processed or the action throws an exception. T
        // he default implementation behaves as if:
//        for (T t : this)
//            action.accept(t);



        /*
        Let us use the same Student class, we want to print name of student along with the remark such that if
        student has scored less than 650 then remark is fail, pass otherwise.
         */

        List<Student> students=new ArrayList<>();

        students.add(new Student(10, "name1", 650));
        students.add(new Student(12, "name2", 750));
        students.add(new Student(13, "name3", 550));
        students.add(new Student(14, "name4", 820));
        students.add(new Student(15, "name5", 720));
        students.add(new Student(16, "name6", 620));

        System.out.println("Original list " + students);



        Consumer<Student> studentConsumer = s -> System.out.println(s.getName() + " : "+ (s.getMarks() >= 650 ? "Pass": "Fail" ));

        students.forEach(studentConsumer);

        /*
        Similar to Consumer interface we have BiConsumer interface also
        The accept() method of the BiConsumer takes two parameters but returns nothing
        Example: map.forEach((k,v) -> System.out.println(k + " : " + v));
         */

    }
}