package com.p8_inheritance;

public class Car extends Vehicle {

    public void displayModel(String model){
        System.out.println("model is : "+model+" from "+name);
    }

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.name = "ford mustang";

        c1.run();

        c1.displayModel("GTx 400");

    }
}
