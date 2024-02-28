package OOPS_Concept;



class A{

    int a=0;
    int b=0;

    public void display(){
        System.out.println("This is a parent class");
        System.out.println(a+b);
    }

}

class B extends A{
    int x=0;
    int y=0;

    public void show(){
        System.out.println("This is a child class");
        System.out.println(x+y);
    }


}

public class Single_Inheritance {

    public static void main(String[] args) {

      A aobj=new A();
      B bobj=new B();

      aobj.a=10;
      aobj.b=20;
        aobj.display();


        bobj.a=20;
        bobj.b=40;
        bobj.display();                                           // B inherits all methods and variables from A



    }
}
