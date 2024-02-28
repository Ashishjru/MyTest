package OOPS_Concept;

class D {

    int a = 0;
    int b = 0;

    public void display() {
        System.out.println("This is a parent class");
        System.out.println(a + b);
    }

}

class E extends D {
    int x = 0;
    int y = 0;

    public void show() {
        System.out.println("This is a child class");
        System.out.println(x + y);
    }


}

class F extends E {
    int d = 0;
    int e = 0;

    public void print() {
        System.out.println("This is a child class F");
        System.out.println(d + e);
    }


}


public class Multilevel_Inheritance {

    public static void main(String[] args) {

        F fobj = new F();

        fobj.a = 10;                                // F inherits from D, E ===All methods and variable
        fobj.b = 20;
        fobj.x = 30;
        fobj.y = 40;
        fobj.d = 20;
        fobj.e = 21;

        fobj.display();
        fobj.show();
        fobj.print();

    }


}
