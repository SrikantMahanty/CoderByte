package  Medium;
import java.util.Arrays;
import java.util.HashMap;

public class StringScamble {

    /**
     * Checks if str1 can be rearranged to form str2.
     *
     * @param str1 input string 1
     * @param str2 input string 2
     * @return "true" if str1 can be rearranged to match str2, otherwise "false"
     */

        public static boolean StringScramble(String str1, String str2) {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            int i = 0, j = 0;
            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] == arr2[j]) {
                    j++;
                }
                i++;
            }
            return j == arr2.length;
        }

    public static void main(String[] args) {
        System.out.println(StringScramble("rkqodlw", "world"));  // true
        System.out.println(StringScramble("hello", "world"));    // false
    }

}
