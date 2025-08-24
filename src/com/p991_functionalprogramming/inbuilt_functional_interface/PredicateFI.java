package com.p991_functionalprogramming.inbuilt_functional_interface;

import com.p991_functionalprogramming.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFI {

    public static void main(String[] args) {
        // 1) Predicate<T> - test(T t); check whether supplied obj satisfied the condition or not

        Predicate<String> p = s -> s.length() >= 5;
        boolean res = p.test("zaid alif");
        System.out.println(res); // true

        // In java 8, The Collection<E> interface defines a method
        // default boolean removeIf(Predicate<? super E> filter)
        // lets use tha that method to filter the student

        List<Student> students=new ArrayList<>();

        students.add(new Student(10, "name1", 650));
        students.add(new Student(12, "name2", 750));
        students.add(new Student(13, "name3", 550));
        students.add(new Student(14, "name4", 820));
        students.add(new Student(15, "name5", 720));
        students.add(new Student(16, "name6", 620));

        System.out.println("Original list " + students);

        Predicate<Student> pr =  student -> student.getMarks() < 700;
        students.removeIf(pr);

        System.out.println("Filtered list " + students.toString());
    }
}
