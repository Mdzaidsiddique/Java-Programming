package com.fundamentals;

public class Identifiers {

    // identifier is the name assigned to the variable, methods, classes, abstract classes, interfaces

    /* Rules to provide identifiers in java:
        identifiers names-
            - should not start with numbers
            - should not start with symbol except '$' & '_'
            - should not have any space in middle
            - conventions is to camelCase (methods, variables name) & PascalCase (Class, Interface, AbstractClass name)

            # Examples of ideal identifiers:
            - Variables & method name: employeeNumber, getAmount(), isActive, calculateBMI()
            - Class, Interface name: Service{}, Utility{}, Customer{}, Order{}, etc
     */

    // Keywords in Java convey a special meaning to the compiler therefore, these cannot be used as identifiers.

    String name = "zaid alif siddique";

    /*
    here, String -> data type
          name -> variable (identifires)
          = -> operator
          "zaid alif siddique" -> value
          ; -> terminator
     */

    /* public class Identifiers{
        here, public -> access modifier
              class -> reserved keyword (special meaning to compiler)
              identifiers -> class name (identifiers)}
    */

    /* private static int add(){
        here, private -> access modifiers
              static -> reserved keyword
              int -> data type (return type)
              add() -> method name (identifiers)}
     */
}
