package  Medium;
import java.util.HashMap;

public class StringScamble {

    /**
     * Checks if str1 can be rearranged to form str2.
     *
     * @param str1 input string 1
     * @param str2 input string 2
     * @return "true" if str1 can be rearranged to match str2, otherwise "false"
     */
    private static String stringScramble(String str1, String str2) {
        HashMap<String, Integer> freq = new HashMap<>();
        String[] arr1 = str1.replaceAll("([^" + str2 + "])", "").split("");
        String[] arr2 = str2.split("");
        for (String letter : arr1) {
            if (freq.containsKey(letter)) {
                freq.put(letter, freq.get(letter) + 1);
            } else {
                freq.put(letter, 1);
            }
        }
        for (String letter : arr2) {
            if (freq.containsKey(letter) && freq.get(letter) > 0) {
                freq.put(letter, freq.get(letter) - 1);
            } else {
                return "false";
            }
        }
        return "true";
    }

    /**
     * Entry point of the program.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        String result1 = stringScramble("win33er", "winner");
        System.out.println(result1); // Output: true

        String result2 = stringScramble("rkqodlw", "world");
        System.out.println(result2); // Output: true
    }
}
