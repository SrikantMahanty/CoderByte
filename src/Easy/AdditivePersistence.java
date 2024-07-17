package Easy;

class Additivepersistence {

    public static int AdditivePersistence(int num) {
        int cnt = 0;
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(AdditivePersistence(4));    // 0
        System.out.println(AdditivePersistence(19));   // 2
        System.out.println(AdditivePersistence(2718)); // 2
        System.out.println(AdditivePersistence(199));  // 3
    }
}
