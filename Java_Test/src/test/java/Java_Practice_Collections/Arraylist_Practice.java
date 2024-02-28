package Java_Practice_Collections;

import java.util.ArrayList;

public class Arraylist_Practice {


    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("Ashish");
        list.add("Kumar");
        list.add("India");
        list.add("Bokaro");

//        System.out.println("Array before removing duplicated"+list);
//
//       ArrayList<String> listNew= duplicateArray(list);
//
//        System.out.println("Array after removing duplicated"+listNew);


        System.out.println("Array before reverse"+list);

        ArrayList<String> ReverseList= reverseArray(list);

        System.out.println("Array after reverse"+ReverseList);

    }



    public static ArrayList<String> duplicateArray(ArrayList<String>list){      // 1.This method is used to remove the duplicate values from a array

        ArrayList<String> list2=new ArrayList<>();

        for(String s:list) {
            if (!list2.contains(s)){

                list2.add(s);
            }

        }
        return list2;
    }

    public static ArrayList<String> reverseArray(ArrayList<String>list){      //this function is used to reverse an array

        ArrayList<String>reverseList=new ArrayList<String>();

        for(int i= list.size()-1;i>=0;i--){

            reverseList.add(list.get(i));

        }

        return reverseList;

    }
}
