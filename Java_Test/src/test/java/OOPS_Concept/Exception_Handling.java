package OOPS_Concept;

import net.bytebuddy.implementation.bytecode.Throw;

public class Exception_Handling {

    public static void main(String[] args) throws ArithmeticException {

        int a=20;

        try{

            System.out.println(a/0);

        } catch (ArithmeticException e) {
       System.out.println(  e.getMessage());

        }

        int b=10;
        

        System.out.println(b/0);

        throw new ArithmeticException("A number cannot divided by zero");




    }
}
