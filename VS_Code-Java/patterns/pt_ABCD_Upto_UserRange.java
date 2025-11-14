package patterns;

// Enter Letters Column Pattern Range : 5
// A B C D E 
// F G H I J
// K L M N O 
// P Q R S T
// U V W X Y

import java.util.Scanner;

public class pt_ABCD_Upto_UserRange {
    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Letters Column Pattern Range : ");
        int range = ip.nextInt();
        // its starting letter
        char letter = 'A';
        // its move row by row
        for (int row = 0; row < range; row++) {
            // its move column by column
            for (int column = 0; column < range; column++) {
                System.out.print(letter++ + " ");
            }
            System.out.println();
        }
    }
}
