package com.p0_miscellaneous;

public class PrintStatement {

    public static void main(String[] args) {

        System.out.println("hello dear");


/*      - Note: println() method belongs to the “java.io.PrintStream” class.
        - 'out' is a  variable of this PrintStream class
        - which is statically defined inside the System class.
        - its like:

        public class PrintStream{
            void println(){...}
            void print(){...}
        }

        public class System{
	        static PrintStream out = new PrintStream(...);
        }

        - that's why we can use System.out.println();

        ***-- may be need clear picture with chat-gpt --** */

    }
}
