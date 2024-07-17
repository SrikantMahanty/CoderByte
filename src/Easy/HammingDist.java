package Easy;

public class HammingDist {
    public static int HammingDistance(String[] strArr) {
        String str1=strArr[0];
        String str2=strArr[1];
        int cnt=0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        String[] A = { "10011", "10100" };
        String[] B = { "helloworld", "worldhello" };
        String[] C = { "coder", "codec" };

        System.out.println(HammingDistance(A)); // Output: 3
        System.out.println(HammingDistance(B)); // Output: 8
        System.out.println(HammingDistance(C)); // Output: 1
    }
}
