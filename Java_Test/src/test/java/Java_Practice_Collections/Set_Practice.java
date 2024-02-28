package Java_Practice_Collections;

import java.util.*;



public class Set_Practice {

    public static void main(String[] args) {

        Set<Integer> list=new HashSet<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);


        // To iterate over each element

        Iterator<Integer>iterator= list.iterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }


        // Adding an arraylist into hashset

        List<String> names= new ArrayList<>();

        names.add("Ashish");
        names.add("kumar");

        System.out.println(names);

        Set<String>mynames=new HashSet<>(names);

        System.out.println(mynames);

        for(String s:mynames){

            System.out.println(s);
        }















    }
}
