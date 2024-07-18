package Easy;

public class BracketMatcher {
    public static int BracketMatcher(String str) {
        int left=0;
        int right=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                left++;

            }else if(str.charAt(i)==')'){
                right++;
            }

        }
        if(left==right){
            return 1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {

        // Test cases
        System.out.println(BracketMatcher("(hello (world))")); // Output: 1
        System.out.println(BracketMatcher("((hello (world))")); // Output: 0
        System.out.println(BracketMatcher("hello world")); // Output: 1B
    }
}
