package Easy;

import java.text.DecimalFormat;

public class DivisionString {

    public static String DivisionStringified(int num1, int num2) {
        int res = (int) Math.round((double) num1 / num2);

        DecimalFormat format = new DecimalFormat("#,###");
        return format.format(res);


    }

    public static void main(String[] args) {
        // Testing the function with the given examples
        System.out.println(DivisionStringified(5, 2)); // 3
        System.out.println(DivisionStringified(6874, 67)); // 103
        System.out.println(DivisionStringified(123456789, 10000));  // 12,346
        System.out.println(DivisionStringified(123456789, 1)); // 123,456,789
        System.out.println(DivisionStringified(12456789, 1)); // 12,456,789
    }
}
