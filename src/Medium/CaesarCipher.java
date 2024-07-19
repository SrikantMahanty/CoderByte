package Medium;

public class CaesarCipher {

    public static String caesarCipher(String str, int num) {

        char []arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if(Character.isLetter(ch)){
                if(Character.isUpperCase(ch)){
                    arr[i]=(char)(((ch-'A'+num)%26)+'A');
                }else if(Character.isLetter(ch)){
                    arr[i]=(char)(((ch-'a'+num)%26)+'a');
                }
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "Caesar Cipher";
        int num = 2;

        System.out.println("Original: " + str);
        String encrypted = caesarCipher(str, num);
        System.out.println("Encrypted with shift " + num + ": " + encrypted); // Output: "Ecguct Ekrjgt"

    }
}
