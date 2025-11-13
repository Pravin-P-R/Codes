package Patterns_program;

import java.util.Scanner;

public class plus_pattern {
    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // It's take pattern range from user
        System.out.print("Enter Patter Range : ");
        int range = ip.nextInt();
        // It's run loop for row
        for (int row = 0; row < range; row++) {
            // It's run loop for column
            for (int column = 0; column < range; column++) {
                if (row == (range - 1) / 2 || column == (range - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                // Delay for 100 milliseconds
                Thread.sleep(100);
            }
            // Move to next line after each row
            System.out.println();
        }
    }

}
