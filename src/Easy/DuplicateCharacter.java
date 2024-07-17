package Easy;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {

    public static  void PrintDuplicate(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] c = s.toCharArray();
        for (char ch : c) {
            if (map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            } else {
                map.put(ch, 1);
            }
            //System.out.println("Duplicate Character in a String ::");
        for(Map.Entry<Character,Integer>entry: map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
        }
        }


    public static void main(String[] args) {
        String testString1 = "geeksforgeeks";
        String testString2 = "programming";

        PrintDuplicate(testString1); // Expected output: g: 2 times, e: 4 times, k: 2 times, s: 2 times
      //  PrintDuplicate(testString2);


    }
    }

