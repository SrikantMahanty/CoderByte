package Easy;

public class PowerSet {
    public static int powerSetCount(int[] arr){
        return (int)Math.pow(2,arr.length);
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        System.out.println(powerSetCount(A)); // 8
    }
}
