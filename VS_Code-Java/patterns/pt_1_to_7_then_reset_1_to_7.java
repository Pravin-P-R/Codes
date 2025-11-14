package patterns;
// Enter Pattern Range : 5
// 1 2 3 4 5 
// 6 7 1 2 3
// 4 5 6 7 1
// 2 3 4 5 6
// 7 1 2 3 4
import java.util.Scanner;

public class pt_1_to_7_then_reset_1_to_7 {
    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Pattern Range : ");
        int range = ip.nextInt();
        int number = 1;
        // its move row by row
        for (int row = 0; row < range; row++) {
            // its move column by column
            for (int column = 0; column < range; column++) {
                // its check condition number is 8
                if (number == 8) {
                    number = 1;
                }
                System.out.print(number++ + " ");
            }
            System.out.println();
        }
    }
}
