package Easy;

public class SimpleEven {
    public static String  SimpleEvenDig(long num){
        while (num>0){
            if(num%2==0){
                num/=10;
            }else{
                return  "false";
            }
        }
        return  "true";
    }

    public static void main(String[] args) {
        System.out.println(SimpleEvenDig(4602225)); // false
        System.out.println(SimpleEvenDig(2222220222L)); // true
        System.out.println(SimpleEvenDig(20864646452L)); // false
    }
}
