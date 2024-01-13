import javax.sound.midi.SysexMessage;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Practice9 {

    public static void main(String[] args) {

        // To find a given number is a perfect number or not /// Logic - All divisores (Sum)==numbber--6 is a perfect number

        /*
        int number=6;

        int sum=0;

        for(int i=1;i<number;i++){

            if(number%i==0){

                sum=sum+i;
            }

        }

        if(sum==number){
            System.out.println("It is a perfect number");
        } else{
            System.out.println("It is a not perfect number");
        }


         */


        // 2 To sort an array in a decending order


        /*

        Integer []ar={1,2,32,4,3,5,4,4};

        Arrays.sort(ar,Collections.reverseOrder());

        System.out.println(Arrays.toString(ar));

         */

        //3 To sort an Arraylist in ascending and decending order

        ArrayList<Integer> aList=new ArrayList<Integer>();

        aList.add(1);
        aList.add(4);
        aList.add(6);
        aList.add(2);


        Collections.sort(aList);                                            // In Ascending order
        System.out.println("The asecnding order value is "+" "+aList);

        aList.sort(Collections.reverseOrder());

        System.out.println("The decending order value is "+" "+aList);    // Descending order value









    }
}
