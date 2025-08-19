package com.p97_serialization;

import java.io.Serializable;

public class A implements Serializable {

    int id;
    transient String password;

    public void printIdPassword(int id, String pass){
        System.out.println("id is : "+id+" and password is : "+pass);
    }
}
