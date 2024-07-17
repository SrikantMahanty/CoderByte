package Easy;

public class OneDecrement {
    public static int dec(long num){
        String str=String.valueOf(num);
        int cnt=0;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)-str.charAt(i)==1){
                cnt++;
            }
        }
        return  cnt;
    }
    public static void main(String[] args) {
        System.out.println(dec(5655984)); // 2
        System.out.println(dec(9876541110L)); // 6
        System.out.println(dec(56)); // 0
    }
}
