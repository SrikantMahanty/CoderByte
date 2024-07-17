package Easy;

import java.util.HashSet;

public class DistnictChar {
    public static String DistinctCharacters(String str) {
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
            if(set.size()>=10){
                return "true";
            }
        }
         return  "false";
    }

    public static void main(String[] args) {
        System.out.println(DistinctCharacters("abc123kkmmmm?")); // false
        System.out.println(DistinctCharacters("12334bbmma:=6")); // true
        System.out.println(DistinctCharacters("eeeemmmmmmmmm1000")); // false
    }
}
