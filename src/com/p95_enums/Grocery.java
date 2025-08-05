package com.p95_enums;

import org.w3c.dom.ls.LSOutput;

public enum Grocery {

    // enums can have methods as well

    SALT(2){
        public void info(){
            System.out.println("the salt info methods");
        }

    },
    SUGER{
        public void info(){ // overridden info() methods for suger only
            System.out.println("this is suger");
        }
    };

    // this info() methods is for all enum constants( SALT, SUGER)
    public void info(){
        System.out.println("this is grocery enums");
    }

    Grocery(){
        System.out.println("Grocery enum contructor invocked...");
        // this will invocked two times (SALT, SUGER) when enum class loads
    }


    int items = 2;


    Grocery(int items){
        this.items = items;
        System.out.println("overloaded constructor: no of items is : "+items);
    }

    public void message(){
        System.out.println("welcome users");
    }


    public static void main(String[] args) {
        System.out.println("welcome to the grocery enum");
    }
}
