import java.util.HashMap;
import java.util.Map;

public class Practice8 {

    public static void main(String[] args) {


        // To find the first non repeated String in a given string

      /*

        String str= "appae";
        Map<Character,Integer>map=new HashMap<Character,Integer>();
boolean status=false;

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);
            if(map.get(ch)==null){

                map.put(ch,1);
            }

            else{
                map.put(ch,map.get(ch)+1);
            }

        }
        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);

            if(map.get(ch)==1){

                System.out.println("First non matched charcter "+" "+ch);
                status=true;
                break;

            }
        }

    if(!status){

        System.out.println("There is no any unique character");
    }



       */



        // 2. To check whether a number is Anagram or not.   Condition ;- Two strings are same i.e length & Character


      String str1="ABC";
      String str2="BCA";

     if( isAnagram(str1,str2)){

         System.out.println("It is a anagram");
     }

     else{
         System.out.println("It is not a anagram");
     }

    }
    public static boolean isAnagram(String str1, String str2){

        Map<Character,Integer> map1=new HashMap<Character,Integer>();
        Map<Character,Integer> map2=new HashMap<Character,Integer>();


        for(int i=0;i<str1.length();i++){

            char ch=str1.charAt(i);

            if(map1.get(ch)==null){

                map1.put(ch,1);
            }
            else{

                map2.put(ch,map1.get(ch)+1);
            }


        }



        for(int i=0;i<str2.length();i++){

            char ch=str2.charAt(i);

            if(map2.get(ch)==null){

                map2.put(ch,1);
            }
            else{

                map2.put(ch,map2.get(ch)+1);
            }


        }

        return map1.equals(map2);
    }
}
