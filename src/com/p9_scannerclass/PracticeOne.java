package com.p9_scannerclass;

import java.util.Scanner;

/* Zia constructions limited is offering construction services on the labour charge basis only as well
as labour charge + Material charges (their charges are as follows):
    - Labour charges: 250/- per square feet
    - Material charges: 350/- per square feet
    - It is up to their customer to choose is they want to get the work done on labour charges only or
    - material + labour charges both
 */

public class PracticeOne {

    public String ziaConstruction(Scanner sc){

        System.out.println("welcome to the zia construction pvt ltd : ");

        System.out.println("Enter your construction area in per square feet (250/sq feet) : ");
        int area = sc.nextInt();

        System.out.println("Would you like to take material (350/ sq feet)? [yes/no]");
        String material = sc.next();

        int bill = 0;

        if(material.equals("yes")) {
            bill += (area * (250 + 350));
        }else{
            bill += (area * 250);
        }

        return "your total bill is : "+bill + ", thank you for choosing zia construction";

        }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PracticeOne p1 = new PracticeOne();

        System.out.println(p1.ziaConstruction(sc));
    }
}

