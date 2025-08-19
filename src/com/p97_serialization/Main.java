package com.p97_serialization;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws Exception{
        A a = new A();

        a.printIdPassword(2, "pass@12");
        FileOutputStream fos = new FileOutputStream("file1.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);
    }

}
