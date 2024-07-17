package Easy;

public class SumMultiplier {

    public static String SumMultiplier(int[] arr){
        int total=0;
        for(int i:arr){
            total+=i;
        }
        int dtotal=2*total;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]*arr[j]>dtotal){
                    return "true";
                }
            }
        }
        return  "false";
    }

    public static void main(String[] args) {
        int[] A = { 2, 5, 6, -6, 16, 2, 3, 6, 5, 3 };
        int[] B = { 2, 2, 2, 2, 4, 1 };
        int[] C = { 1, 1, 2, 10, 3, 1, 12 };

        System.out.println(SumMultiplier(A)); // true
        System.out.println(SumMultiplier(B)); // false
        System.out.println(SumMultiplier(C)); // true
    }
}
