import java.awt.*;
import java.util.*;
import java.util.List;

public class Practice7 {

    public static void main(String[] args) {



       // 1. To find the common divisor betwween two numbers


        /*
        int num1=10;
        int num2=15;

        int common_divisor=0;
        for(int i=1;i<=num1 && i<=num2;i++){



            if(num1%i==0&&num2%i==0){

                common_divisor=i;
            }


        }
        System.out.println(common_divisor);

         */




        // 2. to find the square root of a number

       /*
        double i=25;

        System.out.println(Math.sqrt(i));

        */


        // 3. To reverse an array using collections

     /*
        Integer []a={1,3,2,8};

        List<Integer> list= Arrays.asList(a);

        Collections.reverse(list);

        System.out.println(list);

      */



        // 4. To reverse the words in a given strinh

/*
        String str="My name is Ashish";

        String []words=str.split(" ");

        List<String>word=Arrays.asList(words);

        Collections.reverse(word);

        for(String wr:word){

            System.out.print(wr+" ");
        }



 */


        // 5.  To move the elements in an array upto 1 position into right side

        /*

        int []a ={1,2,3,4,5};

        int size = a.length-1; //4 index index value
        int last= a[size];

        for(int i=size;i>0;i--){

            a[i]=a[i-1];

        }
        a[0]=last;

        System.out.println(Arrays.toString(a));

         */


        // 6.   To swap the last and first element of an array

          /*

        int [] a ={1,2,3,4,5};
        int last_index=a.length-1;


        int temp= a[0];     //temp=5

        a[0]=a[last_index];     // i ==5
        a[last_index]=temp;      // last ==1


        System.out.println(Arrays.toString(a));

           */

        // 7. To find a number is prime or not

        /*


        int a=10;
        boolean isPrime=true;
        if(a>1) {
            for (int i = 2; i < 11; i++) {

                if(a%i==0){

                    isPrime=false;
                }


            }
        }
        else {
            isPrime=false;
        }

        if(isPrime){

            System.out.println("It is a prime number");
        }
        else{

            System.out.println("It is a  not prime number");
        }



         */

        // 8. To find a prime number upto 1 to 100

        /*


        for(int i=1;i<=100;i++){

            boolean isPrime=true;

            if(i>1){

                for(int j=2;j<i;j++){


                    if(i%j==0){

                        isPrime=false;
                    }
                }




            }

            else{
                isPrime=false;
            }

            if(isPrime){

                System.out.print(i+" ");
            }

        }




         */


        // 9. To find the number of words in a given string

        /*

        String str="My Name is Ashish";

        String[]words=str.split(" ");

        System.out.println("Total Number of words is "+words.length);



         */

        // 10. To remove the duplicate character in a string

        /*

        String str="Ashish";

        Set<Character>set=new LinkedHashSet<Character>();

        for(int i=0;i<str.length();i++){

            set.add(str.charAt(i));
        }

        StringBuffer sb=new StringBuffer();

        for(Character c:set){
            sb.append(c);

        }

        System.out.println("After removing the duplicate character the value will be="+" "+sb);


         */


        // 11. To print a star pattern



        //*
        //**
        //***
        //****
        //*****


        /*
        for(int i=0;i<5;i++){                                // Iterate through rows

            for(int j=0;j<=i;j++){

                System.out.print("*");                      // Printing stars in each column each column==no of position
            }

            System.out.println();
 }

         */






























    }
}
