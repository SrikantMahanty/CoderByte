package Easy;

import java.util.ArrayList;
import java.util.List;

public class OverLapp {

    public static String OverlappingRanges(int[] arr) {
        int cnt = 0;
        List<Integer> al = new ArrayList<>();
        List<Integer> al2 = new ArrayList<>();
        // Find the first range
        for (int x = arr[0]; x <= arr[1]; x++) {
            al.add(x);
        }
        for (int y = arr[2]; y <= arr[3]; y++) {
            al2.add(y);
        }

        for (int i = 0; i < al.size(); i++) {
            for (int j = 0; j < al2.size(); j++) {
                if (al.get(i).equals(al2.get(j))) {
                    cnt++;
                }
            }
        }
        if (cnt >= arr[4]) {
            return "true";
        } else {
            return "false";
        }
    }
        public static void main (String[]args){
            int[] A = {5, 11, 1, 5, 1};
            int[] B = {1, 8, 2, 4, 4};
            int[] C = {4, 10, 2, 6, 3};
            int[] D = {1, 2, 1, 3, 1};
            int[] E = {1, 10, 9, 10, 1};
            int[] F = {4, 10, 5, 8, 2};

            System.out.println(OverlappingRanges(A)); // true
            System.out.println(OverlappingRanges(B)); // false
            System.out.println(OverlappingRanges(C)); // true
            System.out.println(OverlappingRanges(D)); // false
            System.out.println(OverlappingRanges(E)); // false
            System.out.println(OverlappingRanges(F)); // false
        }
    }
