package com.p19_CollectionFramework.collection.set;

import java.util.Comparator;

public class StudentRollComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getRoll() > o2.getRoll()) {
            return +1;
        } else if (o1.getRoll() < o2.getRoll()) {
            return -1;
        } else {
            return 0;
        }
    }
    // Now we can add the Student object inside the TreeSet collection object by mentioning
    // this "StudentRollComparator" class in the constructor of the TreeSet object

}
