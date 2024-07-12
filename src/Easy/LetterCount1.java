package Easy;

import java.util.HashMap;

public class LetterCount1 {
    public static int countRepeatedLetters(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        int repeatedcnt = 0;
        for (int cnt : map.values()) {
            if (cnt > repeatedcnt) {
                repeatedcnt = cnt;
            }
        }
        return repeatedcnt;
    }
    public static String letterWithMostRepeatedLetters(String str) {
        String[] words = str.split("\\s+"); // Split string into words by whitespace

        String result = "";
        int maxRepeated = 0;

        for (String word : words) {
            int repeatedCount = countRepeatedLetters(word);
            if (repeatedCount > maxRepeated) {
                maxRepeated = repeatedCount;
                result = word;
            }
        }

        if (maxRepeated == 0) {
            return "-1";
        } else {
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(letterWithMostRepeatedLetters("Hello apple pie")); // Hello
        System.out.println(letterWithMostRepeatedLetters("Today, is the greatest day ever!")); // greatest
        System.out.println(letterWithMostRepeatedLetters("No words")); // -1
        System.out.println(letterWithMostRepeatedLetters("This is to test the last worrdd")); // worrdd
        System.out.println(letterWithMostRepeatedLetters("Ohhhmymymy now the first is theeeeh correct")); // Ohhhmymymy
        System.out.println(letterWithMostRepeatedLetters("The alpaca is amaaazzziinng but so is the golllldddden dog")); // amazing
    }
}
