package Medium;

public class Fibonacci {
    public static String FibonacciChecker(int num) {
        if (isFibonacci(num)) {
            return "yes";
        } else {
            return "no";
        }
    }
    private static boolean isFibonacci(int num) {
        if(num==0 ||num==1){
            return  true;
        }
        int a=0;
        int b=1;
        while(b<=num){
            if(b==num){
                return true;
            }
            int next=a+b;
            a=b;
            b=next;
        }
        return false;
    }


        public static void main(String[] args) {
            System.out.println(FibonacciChecker(2));  // yes
            System.out.println(FibonacciChecker(3));  // yes
            System.out.println(FibonacciChecker(4));  // no
            System.out.println(FibonacciChecker(5));  // yes
            System.out.println(FibonacciChecker(8));  // yes
            System.out.println(FibonacciChecker(10)); // no
    }
}
