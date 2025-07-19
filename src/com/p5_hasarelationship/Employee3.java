package com.p5_hasarelationship;

public class Employee3 {

    // we can have address class as a static member also

    int empId;
    String empName;
    static Address empAddress; // Employee2 has Address (Has-A relationship)

    public void showDetails(){
        System.out.println(empId);
        System.out.println(empName);
        System.out.println(empAddress.houseNumber +" "+ empAddress.locality+" "+empAddress.zipCode);
    };

    public static void main(String[] args) {
        Employee3 emp3 = new Employee3();

        emp3.empId = 12;
        emp3.empName = "dhundhun";

//        empAddress = new Address(); // within the same class we can access the static members directly
//        emp3.empAddress = new Address(); // we can access the static members with the help of object also
//        Address empAddress = new Address(); // we

        Employee3.empAddress = new Address(); // since address class is static member, we can access with class name

        empAddress.houseNumber = 512;
        empAddress.locality = "moon";
        empAddress.zipCode = "10045";

        emp3.showDetails();
    }
};
