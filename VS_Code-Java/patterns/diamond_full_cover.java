package patterns;

import java.util.Scanner;

public class diamond_full_cover {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Enter Diamond Pattern Range = ");
        int ranges = ip.nextInt();
        int mid = ranges / 2;
        for (int row = 0; row < ranges; row++) {
            for (int column = 0; column < ranges; column++) {
                if ((row + column >= mid) && // left slant
                        (column - row <= mid) && // right slant
                       ( row - column <= mid) && // upper/lower balance
                        (row + column <= mid + (ranges - 1))) // bottom slant
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
