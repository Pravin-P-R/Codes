package Patterns_program;

import java.util.Scanner;

public class box_pattern {
    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.print("Enter Pattern Range : ");
        int range = ip.nextInt();

        // it's run loop for row
        for (int row = 0; row < range; row++) {
            // it's run loop for column
            for (int column = 0; column < range; column++) {
                // Condition for print star at border and middle row
                if (row == 0 || row == range - 1 || column == 0 || column == range - 1 || row == range / 2) {
                    System.out.print("* ");
                }
                // Condition for print space
                else {
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
