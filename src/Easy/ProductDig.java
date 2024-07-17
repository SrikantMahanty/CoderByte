package Easy;

public class ProductDig {
    public static int ProductDigits(int num) {
        int max = 10000;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=num; j++) {
                if (i * j == num) {
                    String dig = String.valueOf(i) + String.valueOf(j);
                    int digit = dig.length();
                    if (digit < max) {
                        max = digit;
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(ProductDigits(24)); // Output: 2
        System.out.println(ProductDigits(90)); // Output: 3
        System.out.println(ProductDigits(6)); // Output: 2
        System.out.println(ProductDigits(23)); // Output: 3
        System.out.println(ProductDigits(1)); // Output: 2
        System.out.println(ProductDigits(5000)); // Output: 4
        System.out.println(ProductDigits(72)); // Output: 2
    }
}
