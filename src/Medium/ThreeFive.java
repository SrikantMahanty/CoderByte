package Medium;

public class ThreeFive {

    private static int threeFiveMultiples(int num) {
        int total = 0;
        for (int i = 1; i < num; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += i;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        var result1 = threeFiveMultiples(10);
        System.out.println(result1); // Should print 23

        var result2 = threeFiveMultiples(17);
        System.out.println(result2); // Should print the sum of multiples of 3 and 5 below 17

        var result3 = threeFiveMultiples(117);
        System.out.println(result3); // Should print the sum of multiples of 3 and 5 below 117
    }
}