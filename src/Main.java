import java.util.* ;
import java.io.*;

public class Main {
    public static void print(int n) {
        for (int i = 1; i <= n; i++) {
            // Print characters for the current line
            for (int j = 1; j <= n-i+1; j++) { // Corrected inner loop condition
                System.out.print(i % 2);
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        int n = 4; // Example value of n

        print(n);
    }
}
