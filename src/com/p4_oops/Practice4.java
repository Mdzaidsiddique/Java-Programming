package com.p4_oops;

public class Practice4 {
    // explicit constructor calling with the help of this keyword

    // zero args constructor
    public Practice4(){
        this(10);
        System.out.println("inside zero argument constructor PracticeFour()");
    }

    // one args constructor
    public Practice4(int x){
        this(10, 20);
        System.out.println("inside one argument constructor PracticeFour()");
    }

    // two args constructor
    public Practice4(int x, int y){
        this("zaid alif siddique");
        System.out.println("inside teo argument constructor PracticeFour()");
    }

    // one (string) args constructor
    public Practice4(String name){
//        this(); //this will become the recursive call
        System.out.println("inside string argument constructor PracticeFour()");
    }

    public static void main(String[] args) {
        Practice4 pf = new Practice4();
    }

}
