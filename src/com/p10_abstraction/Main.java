package com.p10_abstraction;

public class Main {

    public static void main(String[] args) {

//  Shape s = new Shape(); // we can not create an object of abs class directly (cz, incomplete impl)
    Shape sr = new Rectangle();
    Shape sc = new Circle();

    sr.draw(); // rectangle
    sc.draw(); // circle

//  but we can create an anonymous class that extends abstract class, and instantiate inline
    Shape s = new Shape() {
        @Override
        public void draw() {
            System.out.println("shape");
        }
    };

    s.draw();

    }
}
