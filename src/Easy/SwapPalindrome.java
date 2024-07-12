package Easy;
//Input: A string str.
//        Task:
//Check if the original string is already a palindrome.
//If it is, return the original string.
//If it is not, try swapping each pair of adjacent characters and check if the resulting string is a palindrome.
//If any such swap results in a palindrome, return the modified string.
//If no such swap results in a palindrome, return "-1".
//Output: The resulting palindrome string after at most one adjacent swap, or "-1" if no such palindrome can be created.

public class SwapPalindrome {
    public static boolean isPalindrome(String str){
            StringBuilder sb=new StringBuilder(str);
            String rev=sb.reverse().toString();
            return rev.equals(str);
    }
    public static  String palindromeSwapper(String str){
        if(isPalindrome(str)){
            return  str;
        }
        for(int i=0;i<str.length()-1;i++){
            char swap[]=str.toCharArray();
            char temp=swap[i];
            swap[i]=swap[i+1];
            swap[i+1]=temp;
            String nwStr=new String(swap);
            if(isPalindrome(nwStr)){
                return  nwStr;
            }
        }
        return "-1";
    }

    public static void main(String[] args) {
        System.out.println(palindromeSwapper("anna")); // anna
        System.out.println(palindromeSwapper("kyaak")); // kayak
        System.out.println(palindromeSwapper("rcaecar")); // racecar
        System.out.println(palindromeSwapper("madam")); // madam
    }
}
