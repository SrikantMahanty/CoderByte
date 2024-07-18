package Medium;

public class CheckPalindrome {
    public static  boolean isPalindromr(String str){
        int low=0;
        int high=str.length()-1;
        while (low<high){
            if(str.charAt(low)!=str.charAt(high)){
                return  false;

            }
            low++;
            high--;
        }
        return true;}
    public static String palindromeTwo(String str){
//        StringBuilder sb=new StringBuilder();
//        for(char c:str.toCharArray()){
//            if(Character.isLetter(c)){
//                sb.append(Character.toLowerCase(c));
//            }
//        }
//        return isPalindromr(sb.toString())?"true":"false";

        String s=str.toLowerCase().replaceAll("[^a-z$]","");
        return isPalindromr(s)?"true":"false";

    }

    public static void main(String[] args) {
        String result1 = palindromeTwo("Noel - sees Leon");
        System.out.println(result1); // Should print "true"

        String result2 = palindromeTwo("A man, a plan, a canal – Panama.");
        System.out.println(result2); // Should print "true"

        String result3 = palindromeTwo("No lemon, no melon!");
        System.out.println(result3); // Should print "true"
    }
}
