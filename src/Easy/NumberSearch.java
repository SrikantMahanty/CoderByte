package Easy;

public class NumberSearch {
    private  static int numberAddition(String str){
        StringBuilder sb=new StringBuilder();
        int totalSum=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                // Collect the digits into StringBuilder
                while (i<str.length() && Character.isDigit(str.charAt(i))){
                    sb.append(str.charAt(i));
                    i++;
                }
                // Convert the collected digits to an integer and add to sum
                totalSum+=Integer.parseInt(sb.toString());
                sb.setLength(0);

            }
        }
        return  totalSum;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(numberAddition("75Number9"));           // 84
        System.out.println(numberAddition("10 2One Number*1*"));   // 13
        System.out.println(numberAddition("88Hello 3World!"));     // 91
        System.out.println(numberAddition("55Hello"));             // 55
        System.out.println(numberAddition("5Hello 5"));            // 10
    }
}
