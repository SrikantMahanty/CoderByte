package Medium;

public class TripleDouble {
    public static int TripleDouble(double num1, double num2) {

        String s1=String.valueOf(num1);
        String s2=String.valueOf(num2);
        for(int i=0;i<=9;i++){
            String triple=String.valueOf(i)+String.valueOf(i)+String.valueOf(i);
            String d=String.valueOf(i)+String.valueOf(i);

        if(s1.contains(triple)&&(s2.contains(d))){
            return 1;
            }
    }
        return  0;
    }

    public static void main(String[] args) {
        double num1 = 451999277L;
        double num2 = 41177722899L;;

        double result = TripleDouble(num1, num2);
        System.out.println(result); // Output: 1
    }

}
