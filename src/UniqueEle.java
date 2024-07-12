import java.util.HashSet;

public class UniqueEle {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            hs.add(num); // Add nums[num] to the HashSet
        }
        System.out.println(nums);

        for (int uniqueNum : hs) {
            sum += uniqueNum; // Sum up all unique numbers in the HashSet
        }

        return sum;
    }
}
