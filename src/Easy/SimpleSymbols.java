package Easy;

import java.util.Scanner;

public class SimpleSymbols{

    public static String simpleSymbols(String str) {
        boolean valid;
        StringBuilder temp = new StringBuilder();

        // eliminate spaces and non letters from the string
        // We only care about the symbols and letters to determine correct positions
        for (int y = 0; y < str.length(); y++) {
            char ch = str.charAt(y);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || ch == '=' || ch == '+') {
                temp.append(ch);
            }
        }

        if (temp.length() > 1) {
            valid = true;
        } else {
            valid = false;
        }

        for (int x = 0; x < temp.length() - 1 && valid; x++) {
            valid = false;
            // Checking the first character of the string
            if (x == 0 && !Character.isLetter(temp.charAt(x))) {
                valid = true;
            }
            // In the case that the starting character is a letter it will result in false
            else if (x == 0 && Character.isLetter(temp.charAt(x))) {
                break;
            }
            // If the current character is a symbol ignore and continue searching for letters
            else if (!Character.isLetter(temp.charAt(x))) {
                valid = true;
            }
            // If a letter is found analyze that the rules are followed
            else if (Character.isLetter(temp.charAt(x)) && temp.charAt(x - 1) == '+' && temp.charAt(x + 1) == '+') {
                valid = true;
            }
        }

        if (valid) {
            return "true";
        } else {
            return "false";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(simpleSymbols("+d += 3 = +s +")); // true
        System.out.println(simpleSymbols("f++d+")); // false
        System.out.println(simpleSymbols("+d===+a+")); // false
        System.out.println(simpleSymbols("+z+z+z+")); // true
        System.out.println(simpleSymbols("2+a+a+")); // true
        System.out.println(simpleSymbols("+z+z+==+a+")); // true
        System.out.println(simpleSymbols("==a+")); // false
        System.out.println(simpleSymbols("a")); // false
        scanner.close();
    }
}
