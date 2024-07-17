package Easy;

public class Superincreasing {
    public static String Superincreasing(int[] arr) {
        int total=0;
        for(int i=0;i<arr.length-1;i++){
            total+=arr[i];
            if(total>=arr[i+1]){
                return "false";
            }
        }
        return "true";
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4 };
        int[] B = { 1, 2, 5, 10 };
        int[] C = { 1, 3, 6, 13, 54 };

        System.out.println(Superincreasing(A)); // false
        System.out.println(Superincreasing(B)); // true
        System.out.println(Superincreasing(C)); // true
    }
}
