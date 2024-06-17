package Easy;
import  java.util.Arrays;

public class LargestFourSum {
    public static  int LargestFour(int[] arr) {
        // If the array length is less than 4, sum all the elements
        if (arr.length <= 4) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum;
        }

        // Sort the array
        Arrays.sort(arr);

        // Sum the largest four elements
        int sum = 0;
        for (int i = arr.length - 4; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(LargestFour(new int[]{1, 1, 1, -5}) == -2);
        System.out.println(LargestFour(new int[]{0, 0, 2, 3, 7, 1}) == 13);
        System.out.println(LargestFour(new int[]{4, 5, -2, 3, 1, 2, 6, 6}) == 21);
        System.out.println(LargestFour(new int[]{1, 1, 0}) == 2);
        System.out.println(LargestFour(new int[]{1000045}) == 1000045);

    }


}
