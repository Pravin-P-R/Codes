package patterns;
// Enter Pattern Range : 5
// A B C D E 
// A B C D E 
// A B C D E
// A B C D E
// A B C D E
import java.util.Scanner;

public class pt_ABCD_ABCD_ABCD {
    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Pattern Range : ");
        int range = ip.nextInt();
        for (int row = 0; row < range; row++) {
            char letter = 'A';
            for (int column = 0; column < range; column++) {
                System.out.print(letter++ + " ");
            }
            System.out.println();
        }
    }
}
