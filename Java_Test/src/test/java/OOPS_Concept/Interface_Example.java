package OOPS_Concept;



interface interface_class{

    int a=10;                                  // It is by default final and static
    void display();                          // It is always abstract
}


public class Interface_Example implements interface_class {        // Implements keyword is used to connect a class into interface

    @Override                                      // Calling a abstract method is mandatory
    public void display() {
        System.out.println(a);
    }

    public static void main(String[] args) {

        Interface_Example obj=new Interface_Example();
        obj.display();


    }
}
