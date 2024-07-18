package Medium;

public class CheckPrime {

    private static String primes(int num) {
        return isPrime(num) ? "true" : "false";
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int upper = (int) Math.sqrt(num);
        for (int i = 2; i <= upper; i++) {
            if (num%i== 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String result1 = primes(195);
        System.out.println(result1); // should print "false"
        String result2 = primes(197);
        System.out.println(result2); // should print "true"
    }
}


