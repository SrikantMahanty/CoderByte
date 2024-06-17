package Easy;

public class WordCount {
    private  static int WordCount(String str){
        if (str == null || str.trim().isEmpty()) {
            return 0; // Handling edge cases like null or empty strings
        }
        int cnt=0;
        str=str.trim();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' ){
                cnt++;
            }
        }
        return cnt+1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(WordCount("Never eat shredded wheat")); // Expected output: 4
        System.out.println(WordCount("Hello World"));              // Expected output: 2
        System.out.println(WordCount(" This is a test.  "));       // Expected output: 4
        System.out.println(WordCount(""));                         // Expected output: 0
        System.out.println(WordCount("   "));                      // Expected output: 0
    }
}
