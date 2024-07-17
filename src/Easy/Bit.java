package Easy;

public class Bit {
    public static String BitwiseOne(String[] strArr){
        String bin1=strArr[0];
        String bin2=strArr[1];
        int len=bin1.length();
        if(bin2.length()!=bin1.length()){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len;i++){
            char ch=bin1.charAt(i);
            char c=bin2.charAt(i);
            if(ch=='1' || c=='1'){
                sb.append('1');
            }else{
                sb.append('0');
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] A = { "100", "000" };
        String[] B = { "00011", "01010" };
        String[] C = { "1001", "0100" };
        System.out.println(BitwiseOne(A)); // 100
        System.out.println(BitwiseOne(B)); // 01011
        System.out.println(BitwiseOne(C)); // 1101
    }
}
