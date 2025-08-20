package com.p97_serialization.objectgraph;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();

        try{
            FileOutputStream fos = new FileOutputStream("dog.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(dog);
            // here we are serializing dog object, but along with that
            // automatically Cat and Rat object will be serialized. because these are the part of the object-graph of the dog object.
            // among above classes if at-least one class is not Serializable then we will get a Runtime exception.


            oos.flush();
            oos.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
