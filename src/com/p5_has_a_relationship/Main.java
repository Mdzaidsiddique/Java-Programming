package com.p5_has_a_relationship;

public class Main {

    public static void main(String[] args) {

        // employee 1
        Employee1 emp1 = new Employee1();
        emp1.showDetails();

        // employee 2
        Employee2 emp2 = new Employee2();
        System.out.println(emp2);

        emp2.empId = 001;
        emp2.empName = "srk";

        emp2.empAddress = new Address();
        emp2.empAddress.houseNumber = 104;
        emp2.empAddress.locality = "Deoria";
        emp2.empAddress.zipCode = "274408";

        emp2.showDetails();

        // employee 3
        Employee3 emp3 = new Employee3();

        emp3.empId = 10;
        emp3.empName = "vk";
        Employee3.empAddress = new Address();
        Employee3.empAddress.houseNumber = 512;
        Employee3.empAddress.locality = "black hole";
        Employee3.empAddress.zipCode = "1512";

        emp3.showDetails();

    }
}
