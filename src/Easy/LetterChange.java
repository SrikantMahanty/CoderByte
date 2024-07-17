package Easy;

import java.util.Scanner;

public class LetterChange {
    public static String letterChanges(String str) {
        StringBuilder sv = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                if (c == 'z') {
                    c = 'a';
                } else if (c == 'Z') {
                    c = 'A';

                } else {
                    c = (char) (c + 1);
                }
                if ("aeiou".indexOf(Character.toLowerCase(c)) != -1) {
                    c = Character.toUpperCase(c);
                }
            }
            sv.append(c);
        }
        return sv.toString();
    }

    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        System.out.println(letterChanges("fun times!"));
    }
}