package OOPS_Concept;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class iterator {

    // to iterate through iterator in a collection
    public static void main(String[] args) {


    ArrayList<String>list=new ArrayList<String>();

    list.add("Ashish");
        list.add("kumar");
        list.add("Bokaro");

        Collections.sort(list);

        Iterator<String>itr= list.iterator();
        while(itr.hasNext()){

            System.out.println(itr.next());
        }











}}
