package Easy;

public class ArithGeo {

    public static String arithGeo(int[] arr) {
        if (arr.length < 2) {
            return "-1";
        }
        boolean isArithmatic = true;
        boolean isGeomotric = true;

        int ArithDiff = arr[1] - arr[0];
        double gemoRatio = (double) arr[1] / arr[0];

        //check
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != ArithDiff) {
                isArithmatic = false;
                break;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if ((double) arr[i] / arr[i - 1] != gemoRatio) {
                isGeomotric = false;
                break;
            }
        }
        if (isArithmatic) {
            return "Arithmetic";
        } else if (isGeomotric) {
            return "Geometric";
        } else {
            return "-1";
        }
    }

    public static void main(String[] args) {
        int[] A = {2, 4, 16, 24};
        int[] B = {5, 10, 15, 20};
        int[] C = {2, 6, 18, 54};
        int[] D = {2, 4, 6, 8};

        System.out.println(arithGeo(A)); // -1
        System.out.println(arithGeo(B)); // Arithmetic
        System.out.println(arithGeo(C)); // Geometric
        System.out.println(arithGeo(D)); // Arithmetic
    }
}
