package Arrays_program;

import java.util.*;

public class first_arr_value_print_second_arr_value_times {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = ip.nextInt();

        int[] matrix1 = new int[size];
        int[] matrix2 = new int[size];
        int index1 = 0, index2 = 0;
        while (index1 < size || index2 < size) {
            if (index1 < size) {
                System.out.print("Enter Array1 Value : ");
                matrix1[index1] = ip.nextInt();
                index1++;
            } else if (index2 < size) {
                System.out.print("Enter Array2 Value : ");
                matrix2[index2] = ip.nextInt();
                index2++;
            }
        }
        process(matrix1, matrix2);
    }

    public static void process(int[] data1, int[] data2) {
        for (int row_index = 0; row_index < data1.length; row_index++) {
            for (int column_imdex = 0; column_imdex < data2[row_index]; column_imdex++) {
                System.out.print(data1[row_index]);
            }
            System.out.println();
        }
    }
}