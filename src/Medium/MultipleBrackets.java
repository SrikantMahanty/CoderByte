package Medium;

import java.util.Stack;

public class MultipleBrackets {

    public static String multipleBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        int roundL = 0, roundR = 0, squareL = 0, squareR = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                stack.push(c);
                roundL++;
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return "0";
                }
                roundR++;
            } else if (c == '[') {
                stack.push(c);
                squareL++;
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return "0";
                }
                squareR++;
            }
        }

        if (stack.isEmpty()) {
            return "1 " + (roundL + squareL);
        } else {
            return "0";

        }
    }

    public static void main(String[] args) {
        String str1 = "(hello [world])(!)";
        String str2 = "((hello [world])";

        System.out.println("Input: " + str1);
        System.out.println("Output: " + multipleBrackets(str1)); // Output: 1 3

        System.out.println("\nInput: " + str2);
        System.out.println("Output: " + multipleBrackets(str2)); // Output: 0
    }
}
