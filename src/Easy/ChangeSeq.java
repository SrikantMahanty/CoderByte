package Easy;

public class ChangeSeq {
    public static int ChangingSequence(int[] arr){
        boolean increasing=arr[0]<arr[1];
        int cidx=-1;
        for(int i=1;i<arr.length;i++){
            if((increasing&& arr[i-1]>arr[i]) || (!increasing&& arr[i-1]<arr[i])){
                cidx=i-1;
                break;

            }
        }
        return cidx;
    }
    public static void main(String[] args) {
        int[] A = { -4, -2, 9, 10 };
        int[] B = { 5, 4, 3, 2, 10, 11 };
        int[] C = { 1, 2, 4, 6, 4, 3, 1 };

        System.out.println(ChangingSequence(A)); // -1
        System.out.println(ChangingSequence(B)); // 3
        System.out.println(ChangingSequence(C)); // 3
    }
}
