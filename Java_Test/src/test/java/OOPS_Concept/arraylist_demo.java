package OOPS_Concept;

import java.util.ArrayList;

public class arraylist_demo {

    public static void main(String[] args) {

        ArrayList<String>al=new ArrayList<String>();

        al.add("as");
        al.add("ie");
        al.add("sn");
        al.add("am");

        System.out.println(al);
        System.out.println(al.size());
        al.add(2,"ashish");

        System.out.println(al);
        al.remove("ashish");
        System.out.println(al);












    }
}
