package com.p18_enums;

// enum can be declared inside and outside of class but not inside a method
// enum outside class
enum Color{
    RED,
    GREEN,
    BLUE,
    GRAY
}

public class Colors {

    // enums inside class
    enum Directions{
        NORTH, SOUTH, EAST, WEST
    }

    public static void main(String[] args) {

        Color blue = Color.BLUE;
        System.out.println(blue);

        Directions north = Directions.NORTH;
        System.out.println(north);
    }

}
