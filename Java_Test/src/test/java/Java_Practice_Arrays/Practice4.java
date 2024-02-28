package Java_Practice_Arrays;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Practice4 {

    public static void main(String[] args) {



        //  1. To find the fibonacci series upto nth term
        // 1 1 2 3 5 8 13 21 34...........n number



       /*  Scanner scan=new Scanner(System.in);


        int a=1;
        int b=1;
        int fibo_num=0;

        System.out.println("Enter a number upto you want to print a fibonacci number");
        int n=scan.nextInt();

        System.out.println(a+" ");
        System.out.println(b+" ");


        while(fibo_num<=n){

            fibo_num=a+b;

            a=b;

            b=fibo_num;

            System.out.println(fibo_num);

        }

        */


       // 2. To reverse a string value


      /*  Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value you want to reverse");
        String str= scan.nextLine();

        String reverse="";

        char[] ch=str.toCharArray();

        int len=ch.length;

        for(int i=len-1;i>=0;i--){

            reverse=reverse + ch[i];

        }
        System.out.println(reverse);

       */


   // 3. To find the factorial of a given number


    /*    Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number you want to print the factorial");

        int n=4;

        int factorial =1;

        for(int i=1;i<=n;i++){

            factorial=factorial*i;

        }

        System.out.println(factorial);

   */



        // 4. To check a given string a palindrome or not

/*

        Scanner scan= new Scanner(System.in);

        String str=scan.nextLine();

        String reverse="";

       char []ch= str.toCharArray();

       int len=str.length();

       for (int i=len-1;i>=0;i--){

           reverse=reverse+ch[i];
       }

       if(reverse.equals(str)){

           System.out.println("It is a palindrome");
       }

       else{

           System.out.println("It is a not a palindrome ");
       }

*/


        // 5. To check a given number is armstrong number or not (153 is a armstrong number)

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter the number you want to check");
        int num=scan.nextInt();
        int original_number=num;
        int remainder=0;

        int sum=0;


        while(num>0){
            remainder=num%10;

            sum=sum+(remainder*remainder*remainder);

            num=num/10;

        }

        if(original_number==sum){

            System.out.println("It is an armstrong number");

        }

        else{
            System.out.println("It is not an palindrome number");
        }

















































    }
}
