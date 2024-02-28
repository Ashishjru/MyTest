package OOPS_Concept;

public class Method_Overloading {


    // Method Overloading means same method with different paramerter and function within a class

    int a=10;
    int b=20;

    void Sum(){                                    // First method

        System.out.println(a+b);
    }

    void Sum(int a, int b){                     // Second method

        this.a=a;                                // 'this ' keyword used to declare the global value
        this.b=b;

        System.out.println(a+b);
    }

    void Sum(int a,int b,int z){                     // Third method

        System.out.println(a+b+z);
    }
    void Sum(int a, double b){                      // Fouth method

        System.out.println(a+b);
    }

    
    public static void main(String[] args) {

        Method_Overloading mo= new Method_Overloading();

        mo.Sum();                                      // Calling each and every function/method
        mo.Sum(20,30);
        mo.Sum(20,10,10);
        mo.Sum(30,25.9);




    }
}
