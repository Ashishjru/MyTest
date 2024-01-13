import java.lang.reflect.AnnotatedType;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice5 {

    public static void main(String[] args) {




        // 1. To remove the duplicate from the array using hashset-   ( Hashset never store a any duplicate value  )

/*
        int []a={1,2,3,2,1,1,3,5,6,7};

        Set<Integer> set=new HashSet<Integer>();


        for(int i=0;i<a.length;i++){


            set.add(a[i]);
        }


        Integer [] b=set.toArray(new Integer[set.size()]);            // To print and hashset to an array

        System.out.print(Arrays.toString(b));                        // To print an array as a string


 */



        // 2. Deleted a duplicates value in a sorted array using value


     /*   int []a ={1,1,2,2,3,3,4,5,6,7,7};

        int d=0;       //next increment



        for(int i=0;i<a.length-1;i++){

            if(a[i]!=a[i+1]){

             a[d]=a[i];
             d++;

            }

            a[d]=a[a.length-1];

            System.out.println(Arrays.toString(a));



        }

      */


        //  3. To find the duplicate elments in an array


        /*
        int []a={1,2,1,3,4,4,5,3};


        for(int i=0;i<a.length;i++){

            for(int j=i+1;j<a.length;j++){

                if(a[i]==a[j])
                {
                    System.out.println(a[i]+" "+"Is a duplicated array ");
                }


            }
 }

         */



// 5. To find a duplicate element in a array using Hashset


    /*    int [] a ={1,2,1,4,5,6,9};

        HashSet<Integer> hset=new HashSet<Integer>();

        for(int i=0;i<a.length;i++) {

            if (!hset.add(a[i])) {

                System.out.println(a[i] + " " + "is a duplicated value");

            }
        }

     */



// 6. To count the number of digits in a number


/*        int a=11233;

        int digitcount=0;

        while(a>0){

            digitcount++;
            a=a/10;
        }

        System.out.println("The total number of count is ="+" "+digitcount);




 */


  // 7.To print any random number within any given range

/*
        int range=100;

        double random=Math.random();                // Math.Random function is used to generate any random number

        System.out.println((int)(range*random));

 */



        // 8. To compare to java arrays

     /*   int [] a={1,2,3,4,5};
        int [] b={1,2,3,2,5};

        if(Arrays.equals(a,b)){

            System.out.println("Arrays are equal");
        }
        else{

            System.out.println("Arrays are not equal");
        }

      */

     // 9. To find the max and min in an given array

        /*

        int []a ={1,2,3,4,4,5,7,12};

        int max=a[0];
        int min=a[0];            // Blindly assign the value for min and max

        for(int i=0;i<a.length;i++){

            if(max<a[i]){

                max=a[i];
            }

            if(min>a[i]){

                min=a[i];
            }

        }

        System.out.println("The min of a given array is="+" "+min);
        System.out.println("The max of a given array is="+" "+max);



         */




        // 10. To Search for a given number in an array

        /*

        Scanner scan =new Scanner(System.in);

        int [] a={1,2,3,4,5,6,7,9};

        int numnber=scan.nextInt();


        for(int i:a){

            if(numnber==a[i]){

                System.out.println("The number is found in the given array");
                break;     // To discontinue the loop
            }

            else{
                System.out.println("The number is not found in the given array");
                break;      // To discontinue the loop

            }

        }

         */




        // 11. To print a array/


        /*
        int [] a={1,2,3,4,5,6,7,9};
        System.out.println(Arrays.toString(a));

         */



        // 12. To sort a array using predefined function


     /*
        int [] a= {1,2,4,2,6,3,78,34,44,21};

        System.out.println("Before the sorting"+" "+Arrays.toString(a));

        Arrays.parallelSort(a);       // This predefined function is used to sort the given array

        System.out.println("After the sorting"+" "+Arrays.toString(a));

      */



        // 13.
























        














    }
}
