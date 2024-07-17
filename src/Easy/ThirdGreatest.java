package Easy;

import java.util.Arrays;
import java.util.Comparator;

public class ThirdGreatest {
    public static  String ThirdGreatest(String[] strArr){
//        String s1="";
//        String s2="";
//        String  s3="";
//        for (String w:strArr){
//            if(w.length()>s1.length()){
//                s3=s2;
//                s2=s1;
//                s1=w;
//            }else if(w.length()>s2.length()){
//                s3=s2;
//                s2=w;
//            }else if(w.length()>s3.length()){
//                s3=w;
//            }
//        }
//        return s3;
        Arrays.sort(strArr, Comparator.comparing(String::length).reversed());
        return strArr[2];
    }

    public static void main(String[] args) {
        // Test cases
        String[] A = { "coder", "byte", "code" };
        String[] B = { "abc", "defg", "z", "hijk" };
        String[] C = { "hello", "world", "before", "all" };
        String[] D = { "hello", "world", "after", "all" };

        // Output the results
        System.out.println(ThirdGreatest(A)); // code
        System.out.println(ThirdGreatest(B)); // abc
        System.out.println(ThirdGreatest(C)); // world
        System.out.println(ThirdGreatest(D)); // after
    }
}
