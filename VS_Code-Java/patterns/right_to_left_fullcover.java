package patterns;

// Enter Pattern Range : 5
//         * 
//       * *
//     * * *
//   * * * *
// * * * * *
import java.util.Scanner;

public class right_to_left_fullcover {
    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Pattern Range : ");
        int range = ip.nextInt();
        // its move row by row
        for (int row = 0; row < range; row++) {
            // its move column by column
            for (int column = 0; column < range; column++) {
                // its check condition column is greater than or equal to (range-1)-row
                if ((range - 1) - row <= column) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            // print new line after each row
            System.out.println();
        }
    }
}
