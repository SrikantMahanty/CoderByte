package Easy;

public class BitWiseTwo {

    public static String bitwiseAnd(String[] strArr) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strArr[0].length();i++){
            if(strArr[0].charAt(i)=='1' && strArr[1].charAt(i)=='1'){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] A = {"10111", "01101"};
        String[] B = {"10100", "11100"};

        System.out.println(bitwiseAnd(A)); // 00101
        System.out.println(bitwiseAnd(B)); // 10100
    }
}
