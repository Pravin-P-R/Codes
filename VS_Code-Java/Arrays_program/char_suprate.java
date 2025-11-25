package Arrays_program;

import java.util.*;

public class char_suprate {
    public static void main(String[] args) {
        // Scanner Object
        Scanner ip = new Scanner(System.in);
        // Input Size of Array
        System.out.print("\nEnter Size of Array : ");
        int size = ip.nextInt();
        ip.nextLine(); // FIX: remove leftover newline
        // Declare Array
        char[] char_data = new char[size];
        // Input Array Elements
        for (int index = 0; index < size; index++) {
            // Input Character
            System.out.print("Enter character " + (index + 1) + ": ");
            char_data[index] = ip.nextLine().charAt(0);
        }
        // pass Array to process method
        process(char_data);
    }

    public static void process(char[] let) {
        // Print Output
        for (int index = 0; index < let.length; index++) {

            if (index != 0) { // FIX: print comma after first
                System.out.print(", ");
            }
            // Check for Uppercase, Lowercase, or Non-alphabetic
            if (let[index] >= 'A' && let[index] <= 'Z') {
                System.out.print(1);
            } else if (let[index] >= 'a' && let[index] <= 'z') {
                System.out.print(-1);
            } else {
                System.out.print(0);
            }
        }
    }
}
