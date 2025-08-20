package com.p97_serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentSerializationExample {


    public void serializationExample(Student s1){

        try{
            // serialization: object to byte stream (student.txt)

            FileOutputStream fos = new FileOutputStream("student.txt");
            // this will open a file 'student.txt' (acts as a pipeline to write bytes)
            // this student.txt created in the root folder (or provided path) & not readable (byte stream)

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // this will wrap the file stream so that we can write objects not just a text/numbers

            oos.writeObject(s1); // converts s1 into byte stream and writes it into the file

            oos.flush();

            oos.close();
            fos.close(); // always close stream to free resources

//          Note: Inside student.txt: You won’t see "alif" and "45" in plain text.
//          You’ll see unreadable bytes because it’s a serialized object.

            System.out.println("Object has been serialized");
            System.out.println("Login password is : "+ s1.loginPassword); // Login password is : Pass@45

        }catch (Exception e){
            e.getMessage();
        }
    }

    public void deserializationExample() throws Exception{

        FileInputStream fis = new FileInputStream("student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s2 = (Student) ois.readObject(); // convert bytes back to object

        ois.close();
        fis.close();

        System.out.println("Object has been deserialized");
        System.out.println("Name: " + s2.name + ", Roll: " + s2.roll + ", Login Password : "+s2.loginPassword);
        // Name: alif, Roll: 45, Login Password : null (bcz of transient kw)
    }

    public static void main(String[] args) throws Exception {

        Student s1 = new Student("alif", 45, "Pass@45");
        StudentSerializationExample ss = new StudentSerializationExample();

        ss.serializationExample(s1); // serialization (object - byte stream)

        ss.deserializationExample(); // Deserialization (reading object from file)

    }
}
