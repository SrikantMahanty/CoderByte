package Medium;

public class Swap2 {

    public static String swapII(String str) {
        char[] arr = str.toCharArray();

        // Swap case of each character
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLowerCase(arr[i])) {
                arr[i] = Character.toUpperCase(arr[i]);
            } else if (Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }

        // Swap places of numbers if between two letters
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (Character.isLetter(arr[j])) {
                        char hold = arr[i];
                        arr[i] = arr[j];
                        arr[j] = hold;
                        break; // Stop swapping after the first letter found
                    }
                }
            }
        }

        System.out.println(new String(arr));
        return  new String(arr);
}

    public static void main(String[] args) {
        String result = swapII("6Hello4 -8World, 7 yes3");
        System.out.println(result); // Output: 4hELLO6 -8wORLD, 7 yes3
    }
}

