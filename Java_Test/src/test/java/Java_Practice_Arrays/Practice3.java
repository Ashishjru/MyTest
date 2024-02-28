package Java_Practice_Arrays;

import java.util.Scanner;

public class Practice3 {


    public static void main(String[] args) {


        // 1. To find the sum of all digits on a number

      /*  int number=1010;

        int remainder=0;

        int sum=0;

        while(number>0){

            remainder=number%10;
            sum=sum+remainder;

            number=number/10;

        }System.out.println(sum);


       */



        // 2. To convert an string to an  integer.

      /*  String str="9";

        int number=Integer.parseInt(str);
        System.out.println(number);


       */

        // 3. To convert a number to an string


      /*  int num=8;

        String str=Integer.toString(num);

        System.out.println(str);


       */


       // 4. To count a number of digits, letters, Symbols and spaces in a given string


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string you want to check");
       String str= scan.nextLine();

     char []ch=  str.toCharArray();

     int digit=0;
     int letter=0;

     int spaces=0;
     int other_things=0;

     for(Character c:ch){

         if(Character.isDigit(c)){

             digit++;
         } else if (Character.isLetter(c)) {

             letter++;

         } else if (Character.isSpaceChar(c)) {

             spaces++;

         }
else{

    other_things++;
         }

     }

     System.out.println("Total count for digit ="+" "+digit);
        System.out.println("Total count for letters ="+" "+letter);
        System.out.println("Total count for spaces ="+" "+spaces);
        System.out.println("Total count for others character ="+" "+other_things);














    }

}
