package patterns;

// Enter Pattern Range : 5
// 0 0 0 0 0 
// 1 1 1 1 1
// 0 0 0 0 0
// 1 1 1 1 1
// 0 0 0 0 0
import java.util.*;

public class pt_00_11_00_11 {
    static Scanner ip = new Scanner(System.in);
// its main method
    public static void main(String[] args) {
        // get the range from user
        System.out.print("Enter Pattern Range : ");
        int range = ip.nextInt();
        // its move row by row
        for (int row = 0; row < range; row++) {
            // its move column by column
            for (int column = 0; column < range; column++) {
                // its check condition row is even
                if ((row - 1) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
