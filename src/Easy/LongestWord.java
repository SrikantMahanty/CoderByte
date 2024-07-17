package Easy;

public class LongestWord {
    public static String Longestword(String sen) {
        String ans = "";
        String[] word = sen.split("[^A-Za-z0-9]+");

        for (String w : word) {
            if (w.length() > ans.length()) {
                ans =w;
            }
        }
        return ans;
    }

    public static void main(String[] args) {


        // Test cases
        System.out.println(Longestword("itsdsfsfs lovdsdsadsae dogsss  testi!!!!!!!!!!!!!!@!#@#@#@#@#@#@#@#@!!!! helllo whatisgoingonherenowthisiscrazy who did this"));
        System.out.println(Longestword("hello"));
        System.out.println(Longestword("Wow very beautiful")); // beautiful
        System.out.println(Longestword("nice very cool")); // nice
        System.out.println(Longestword("fun&!! time")); // time
        System.out.println(Longestword("123456789 98765432"));
    }
}
