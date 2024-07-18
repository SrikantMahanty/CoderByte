package  Medium;
public class EvenPair {

    /**
     * Checks if a given number is even.
     *
     * @param num the number to check
     * @return true if the number is even, false otherwise
     */
//    private static boolean isEven(int num) {
//        return num % 2 == 0;
//    }

    /**
     * Even Pairs function.
     *
     * @param str input string
     * @return "true" if a pair exists, "false" otherwise
     */
    public static String evenPairs(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            char nextChar = str.charAt(i + 1);

            // Check if both characters are digits
            if (Character.isDigit(currentChar) && Character.isDigit(nextChar)) {
                int num1 = Character.getNumericValue(currentChar);
                int num2 = Character.getNumericValue(nextChar);

                // Check if both numbers are even
                if (num1 % 2 == 0 && num2 % 2 == 0) {
                    return "true";
                }
            }
        }
        return "false";
    }

    /**
     * Entry point.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        String result1 = evenPairs("7r5gg812");
        System.out.println(result1); // Output: true

        String result2 = evenPairs("f178svg3k19k46");
        System.out.println(result2); // Output: true
    }
}
