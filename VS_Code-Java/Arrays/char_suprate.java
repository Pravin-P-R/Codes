package Arrays;

import java.util.*;

public class char_suprate {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("\nEnter Size of Array : ");
        int size = ip.nextInt();
        ip.nextLine(); // FIX: remove leftover newline
        char[] char_data = new char[size];
        for (int index = 0; index < size; index++) {
            System.out.print("Enter character " + (index + 1) + ": ");
            char_data[index] = ip.nextLine().charAt(0);
        }
        process(char_data);
    }

    public static void process(char[] let) {
        for (int index = 0; index < let.length; index++) {

            if (index != 0) { // FIX: print comma after first
                System.out.print(", ");
            }

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
