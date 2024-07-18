package Medium;

import java.util.Arrays;
import java.util.HashSet;

public class ConsecutiveExample {

    public static int Consecutive(int[] arr) {
        Arrays.sort(arr);
        int min=arr[0];
        int max=arr[arr.length-1];
        HashSet<Integer>set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int cnt=0;
        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 6};
        System.out.println("Input Array: " + Arrays.toString(arr));
        System.out.println("Minimum numbers needed: " + Consecutive(arr)); // Output: 2
    }
}
