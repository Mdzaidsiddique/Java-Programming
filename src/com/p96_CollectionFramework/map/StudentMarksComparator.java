package com.p96_CollectionFramework.map;

import java.util.Comparator;

public class StudentMarksComparator implements Comparator<Student> {

    // this class will be used in TreeMapExample class

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMarks() > o2.getMarks() ? 1 : -1;
    }
}
