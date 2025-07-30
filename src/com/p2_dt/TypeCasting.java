package com.p2_dt;

public class TypeCasting {
/*   - the process of converting data from one data type to another data type is called type casting
     - Note: type checking is the responsibility of compiler and Type Casting is the responsibility of JVM

     - there are two types of primitive data type casting:

     1) implicit type casting (widening): process to convert lower data types to higher data types
 */

    public static void implicitTypeCasting() {
        byte b = 10; int i = b;
        System.out.println(b+" "+i); // 10 10

        int i1 = 10;
//      byte b1 = i1; //java: incompatible types: possible lossy conversion from int to byte

        byte b1 = 65;
//      char c = b1; //  incompatible types: possible lossy conversion from byte to char

        char c = 'A';
        int i2 = c;
        System.out.println(c+" "+i2); // A 65 (reason: char internal data representation is compatible with int)

/*      Note- If we perform any arithmetic operation on primitive data types variables then the result data type
        will be according to the following formula:
        max (int, type1, type2, type3,...)
        i.e: the returned data type of this statement is [max (int, byte, byte) ——> int]
*/
        byte b3=60;
        byte b4=70;
//      byte b5=b3+b4; // incompatible types: possible lossy conversion from int to byte
        int b5= b3+b4;
        System.out.println(b5);
    }

    /*
        2) explicit type casting (narrowing): the process of converting higher data types to lower data types
          - to perform explicit type casting we have to use the following pattern

            P a = (Q) b;  where, (Q)-> cast operator

          - P & Q are two primitive data types, where Q must be either same or lower than P
     */
    public static void explicitTypeCasting(){
        int i = 10;
        byte b = (byte) i;
        System.out.println(i+" "+b);

        byte b1=30;
        byte b2=30;
        byte b3=(byte)(b1+b2);
        System.out.println(b3);
    }


    public static void main(String[] args) {
        implicitTypeCasting();
        explicitTypeCasting();
    }

}

