package OOPS_Concept;

public class Static_Keyword {


    public void non_static(){

        System.out.println("It is a non static method");

    }

    public static void static_function(){

        System.out.println("It is a static method");
    }


    public static void main(String[] args) {
        static_function();                          //calling a static function

        Static_Keyword obj=new Static_Keyword();
        obj.non_static();                            //calling a non static function





    }
}
