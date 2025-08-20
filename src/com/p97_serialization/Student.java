package com.p97_serialization;

import java.io.Serializable;

public class Student implements Serializable { // serializable tells java this class can be serialized

    String name;
    int roll;
    transient String loginPassword;
    static String fatherName; // won't be part of obj (won't serializable)

    public Student(String name, int roll, String loginPassword){
        this.name = name;
        this.roll = roll;
        this.loginPassword = loginPassword;
    }

    // now check StudentSerializationExample class
}
