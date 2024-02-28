package OOPS_Concept;

public class Employee {

    int salary;
    int emp_no;
    String name;

    void display(){                                 // void is used to declare that it does not return any data type

        System.out.println(salary);
        System.out.println(emp_no);
        System.out.println(name);
    }


    /*
    Employee(int sal, String emp_name, int no){                // 3, By Creating a constructor

        salary=sal;
        name=emp_name;
        emp_no=no;
    }

     */

    void setData(int sal, String emp_name, int no){                  //3. By creating a method

        salary=sal;
        name=emp_name;
        emp_no=no;
    }




    public static void main(String[] args) {

        // 1. Assigning the value using object

       /* Employee emp1=new Employee();                 // It is a first employee declaration (As an object)

        emp1.emp_no=1;
        emp1.salary=20000;
        emp1.name="Ashish";
        emp1.display();

        Employee emp2 = new Employee();                // It is a second employee declaration (As an object)

        emp2.emp_no=2;
        emp2.salary=10000;
        emp2.name="Aditya";

        emp2.display();

        */


        // Now assign the values by using the constructor
        /*

       Employee emp1=new Employee(20000,"Ashish",25);    // Calling the constructor and assigning the value
       emp1.display();

     Employee emp2=new Employee(4000,"Kumar",26);
     emp2.display();

         */


        // 3.Using the method


        Employee emp=new Employee();
        emp.setData(25000,"Raja",4);
        emp.display();

    }




    }




