package Easy;

public class SnakeCase {
    public static   String Snake(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(Character.isLetter(ch)){
                sb.append(Character.toLowerCase(ch));
            }else if(Character.isWhitespace(ch) ||!Character.isLetterOrDigit(ch)){
                sb.append("_");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(Snake("BOB loves-coding")); // bob_loves_coding
        System.out.println(Snake("cats AND*Dogs-are Awesome")); // cats_and_dogs_are_awesome
        System.out.println(Snake("a b c d-e-f%g")); // a_b_c_d_e_f_g
    }
}
