package Easy;

public class BinaryConverter {
    public static int convert(String str) {
        int cnt=0;
      //  int length=str.length();
        for(int i=0;i<str.length();i++){
            if(str.charAt(str.length()-1-i)=='1'){
                cnt+=Math.pow(2,i);
            }

        }return  cnt;
    }

    public static void main(String[] args) {
        System.out.println(convert("101"));  // Output: 5
        System.out.println(convert("1000")); // Output: 8
    }
}
