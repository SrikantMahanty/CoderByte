package Medium;

public class PrimeMover {

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int upper = (int) Math.sqrt(num);

        for (int i = 2; i <=upper; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

    private static int primeMover(int num) {
        int cnt = 0;
        int check = 2;
        while (cnt < num) {
            if (isPrime(check)) {
                cnt++;
            }
            check++;
        }
        return check - 1;
    }

    public static void main(String[] args) {
        int result1 = primeMover(9);
        System.out.println(result1); // Output: 23
        int result2 = primeMover(100);
        System.out.println(result2); // Output: 541
    }
}
