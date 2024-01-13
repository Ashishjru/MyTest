import java.util.Date;
import java.util.Scanner;

public class Practice6 {

    public static void main(String[] args) {



        // 1. To  remove white space, special character and junks from a  given String



  // will be review next    replaceAll function is going to be used



        // 2, To remove the white space from a string


    /*    String str="My name is Ashish";

      String result=  str.replaceAll("\\s","");

      System.out.println(result);

     */


        // 3. To reverse each and every word in a str/string


        /*
        String str="My name is Ashish";

        String [] words=str.split(" ");

        String reverse_str="";

        for(String word:words){                                  // It will iterate through the each word

            String reverse_word="";

            for(int i=word.length()-1;i>=0;i--){                 // It will iterate through the each letter in a word

                reverse_word=reverse_word+word.charAt(i);

            }

            reverse_str=reverse_str + reverse_word + " ";      // " " is required to give a space

        }

        System.out.println(reverse_str);

         */


        // 4. To find the ASCII value of a given character

         /*
        char c='A';
        int value=(int)c;

        System.out.println("The ASCII value is "+" "+value);


          */


        // 5. To print the date and time

        /*

        Date date=new Date();

        System.out.println(date);

         */


     // 6.  To print odd numbers for 1 to 10

        /*


     for(int i=1;i<10;i++){

         if(i%2!=0){

             System.out.println("It is a odd number"+i);
         }



     }

         */

   // 7. To find the total number of factors of a number

        /*

        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        int no_factors=0;

        System.out.println("Below are the factors ");

        for(int i=1;i<=num;i++){

            if(num%i==0){

                System.out.print(i+ " ");

                no_factors++;
            }



        }
        System.out.println();
        System.out.println("Total factor is "+no_factors);


         */


        //


























    }
}
