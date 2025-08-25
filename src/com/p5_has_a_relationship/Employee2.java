package com.p5_has_a_relationship;

public class Employee2 {
    int empId;
    String empName;
    Address empAddress; // Employee2 has Address (Has-A relationship)

    public void showDetails(){
        System.out.println(empId);
        System.out.println(empName);
        System.out.println(empAddress.houseNumber +" "+ empAddress.locality+" "+empAddress.zipCode);
    }
}
