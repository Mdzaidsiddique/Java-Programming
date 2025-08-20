package com.p97_serialization.inheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws Exception{

        Dog1 d = new Dog1();

//        FileOutputStream fos = new FileOutputStream("SerIn.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//        oos.writeObject(d); // dog object is serialized even though dog class haven't implemented Serializable(I)
//        System.out.println("serialized");


        B b1 = new B();
        b1.x  =100;
        b1.y = 200;

        FileOutputStream fos=new FileOutputStream("b.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(b1);;

        System.out.println("serialized the Child object b");
        System.out.println(b1.x +" : " + b1.y);

        System.out.println("After Deserialization");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("b.txt"));

        B b2 = (B) ois.readObject();

        System.out.println(b2.x);
        System.out.println(b2.y);



    }

}
