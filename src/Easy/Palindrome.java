package Easy;
import java.util.Scanner;

public class Palindrome {
    private static String isPalindrome(String str){

//        StringBuilder sb=new StringBuilder();
//        for(char c:str.toCharArray()){
//            if(Character.isLetterOrDigit(c)){
//                sb.append(Character.toLowerCase(c));
//            }
//        }
//        System.out.println(sb);

        String actual=str.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        String sb1=new StringBuilder(actual).reverse().toString();
        if(  actual.equals(sb1)){
            return  "true";
        }else{
            return "false";
        }

//        int size=sb.length()-1;
//        for(int i=0;i<sb.length()/2;i++){
//            if(sb.charAt(i)!=sb.charAt(size-i)){
//                return  " false";
//            }
//        }
//        return  "true";
//        StringBuilder rev=new StringBuilder(sb).reverse();
//        if(sb.toString().equals(rev.toString())){
//            return  "true";
//        }else{
//            return "false";
//        }


       // return new String();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string to check if it is a palindrome: ");
//        String input = scanner.nextLine();

        // Test cases
        System.out.println(isPalindrome("racecar"));               // true
        System.out.println(isPalindrome("eye"));                   // true
        System.out.println(isPalindrome("what is this"));          // false
        System.out.println(isPalindrome("never odd or even"));     // true
        System.out.println(isPalindrome("A man, a plan, a canal, Panama"));  // true

        // Custom input test
//        System.out.println(isPalindrome(input));

        scanner.close();
    }
}
