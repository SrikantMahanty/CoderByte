package Medium;

public class RunLength {

    public static  String runLength(String str){
        if(str.isEmpty()){
            return  "";
        }
        StringBuilder sb=new StringBuilder();
        char prev=str.charAt(0);
        int cnt=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==prev){
                cnt++;
            }else{
                sb.append(cnt).append(prev);
                cnt=1;
                prev=str.charAt(i);
            }
        }
        sb.append(cnt).append(prev);
        return sb.toString();

    }

    public static void main(String[] args) {
        var result1 = runLength("ultrarevolutionaries");
        System.out.println(result1); // Expected output: 1u1l1t1r1a1r1e1v1o1l1u1t1i1o1n1a1r1i1e1s
        var result2 = runLength("underworld");
        System.out.println(result2); // Expected output: 1u1n1d1e1r1w1o1r1l1d
    }
    }

