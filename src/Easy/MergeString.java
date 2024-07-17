package Easy;

public class MergeString {
    public static  String MergeString(String str){
        int middle=str.indexOf('*');
        String first=str.substring(0,middle);
        String sec=str.substring(middle+1);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<middle;i++){
            sb.append(first.charAt(i));
            sb.append(sec.charAt(i));
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(MergeString("abc1*kyoo")); // akbyco1o
        System.out.println(MergeString("aaa*bbb")); // ababab
        System.out.println(MergeString("123hg*aaabb")); // 1a2a3ahbgb
    }
}
