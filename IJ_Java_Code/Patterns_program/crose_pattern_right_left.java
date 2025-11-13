package Patterns_program;

import java.util.Scanner;

public class crose_pattern_right_left {
    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        // It's take pattern range from user
        System.out.print("Enter Patter Range : ");
        int range = ip.nextInt();
        // It's run loop for row
        for (int row = 0; row < range; row++) {
            // It's calculate column for print star at right left cross
            int temp = (range - 1) - row;
            // It's run loop for column
            for (int column = 0; column < range; column++) {
                // Condition for print star at right left cross
                if (temp == column) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }
            // Move to next line after each row
            System.out.println();
        }
    }
}
