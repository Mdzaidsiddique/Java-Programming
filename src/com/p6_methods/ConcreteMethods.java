package com.p6_methods;

public class ConcreteMethods {

//  concrete methods: declaration & implementation
    public void fun1(){
        System.out.println("this method have void as return type");
        System.out.println("i.e. its not going to return any value");

    }

    public int fun2(){
        return 1;
    }

    public boolean fun3(int x, int y) {
        if (x > y) {
            return true;
        } else {
            return false;
        }
    }

    public Object fun4(ConcreteMethods cm){
        return cm;
    }

//    return type: primitive , user defined, if obj, then args - > current class, child class, null
    public static void main(String[] args) {
        ConcreteMethods cm = new ConcreteMethods();
        System.out.println(cm.fun3(3,4));

        Object o = cm.fun4(null);

        System.out.println(o);

    }
}
