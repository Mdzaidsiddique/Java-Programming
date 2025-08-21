package com.p12_object;

public class ObjectClass {

//    java object class: parent of all classes

    public static void main(String[] args) {

        ObjectClass oc = new ObjectClass();

        oc.getClass();

        try {
            Object obj = oc.clone();
            oc.equals(obj);
        }catch (Exception e){
            e.getMessage();
        }

        oc.hashCode();
        oc.notify();
        oc.toString(); //etc.


    }
}
