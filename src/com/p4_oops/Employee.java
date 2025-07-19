package com.p4_oops;

public class Employee {

    // constructor overloading

    String empName;
    int empAge;
    double empSalary;

    // zero args constructor
    Employee(){
        empName = "md zaid siddique";
        empAge = 26;
        empSalary = 90000.00;
    }

    // overloaded constructor with arguments
    Employee(String name, int age, double salary){
        empName = name;
        empAge = age;
        empSalary = salary;
    }


    public void showDetails(){
        System.out.println("Employee name : "+empName);
        System.out.println("Employee age : "+empAge);
        System.out.println("Employee salary : "+empSalary);

    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.showDetails();

        Employee emp2 = new Employee("zaid alif siddique", 26, 50000.00);
        emp2.showDetails();
    }
}
