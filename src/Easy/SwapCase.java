package Easy;

public class SwapCase {
    private static  String swapCase(String str){

        StringBuilder stringBuilder=new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch)){
                stringBuilder.append(Character.toUpperCase(ch));

            }else if(Character.isUpperCase(ch)){
                stringBuilder.append(Character.toLowerCase(ch));
            }else {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        // Test cases
        System.out.println(swapCase("hello World")); // Output: HELLO wORLD
        System.out.println(swapCase("Hello-LOL"));   // Output: hELLO-lol
        System.out.println(swapCase("Sup DUDE!!?")); // Output: sUP dude!!?
    }
}
