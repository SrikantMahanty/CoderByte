package Medium;
//Input: "af5c a#!"
//Output: "1653 1#!"
public class NumberEncoding {
    public static String NumberEncoding(String str) {
        StringBuilder sb =new StringBuilder();
        for(char ch:str.toCharArray()){
            if(Character.isLetter(ch)){
                //int pos=ch-'a'+1;
                sb.append(ch-'a'+1);
            }else{
                sb.append(ch);

            }
        }
        return  sb.toString();
    }

    public static void main(String[] args) {
        String str = "af5c a#!";
        System.out.println(NumberEncoding(str)); // Output: "1653 1#!"
    }
}
