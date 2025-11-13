package Patterns_program;

import java.util.Scanner;

public class cross_patterns_Left_Right {
    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        // It's take pattern range from user
        System.out.print("Enter Patter Range : ");
        int range = ip.nextInt();
        // It's run loop for row
        for (int row = 0; row < range; row++) {
            // It's run loop for column 
            for (int column = 0; column < range; column++) {
                // Condition for print star at left right cross
                if (row == column) {
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
