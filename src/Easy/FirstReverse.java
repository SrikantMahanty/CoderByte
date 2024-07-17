package Easy;

public class FirstReverse {
    public static  String Reverse(String str){
        return new  StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(Reverse("coderbyte"));
    }
}
