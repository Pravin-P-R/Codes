package patterns;

import java.util.Scanner;

public class pt_center_star {
    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Pattern Range : ");
        int range = ip.nextInt();
        for (int row = 0; row < range; row++) {
            for (int column = 0; column < range; column++) {
                if ((column <= (range / 2) - row) && (column >= (range / 2) + row)) {
                    System.out.print("* ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
