package patterns;

// Enter Pattern Range : 5
// * * * * * 
//   * * * *
//     * * *
//       * *
//         *
import java.util.Scanner;

public class pt_reverse_left_to_right {
    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Pattern Range : ");
        int range = ip.nextInt();
        // its move row by row
        for (int row = 0; row < range; row++) {
            // its move column by column
            for (int column = 0; column < range; column++) {
                // check condition
                if (row <= column) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}