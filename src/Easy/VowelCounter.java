package Easy;

public class VowelCounter {
    private static int VowelCount(String str){
        int cnt=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='a'|| c=='e'|| c=='i'||c=='o'||c=='u'){
                cnt++;
            }
        }
        return  cnt;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(VowelCount("hello"));           // Expected output: 2
        System.out.println(VowelCount("hello world"));     // Expected output: 3
        System.out.println(VowelCount("All cows eat grass")); // Expected output: 5
    }
}
