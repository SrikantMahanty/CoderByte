package Easy;

public class PowerOfTwo {
    public static boolean PowersofTwo(int num) {
        if(num <0){
            return  false;
        }
        return (num &(num-1))==0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(PowersofTwo(4));   // true
        System.out.println(PowersofTwo(124)); // false
        System.out.println(PowersofTwo(16));  // true
        System.out.println(PowersofTwo(22));  // false
    }
}
