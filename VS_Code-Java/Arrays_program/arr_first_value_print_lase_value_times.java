package Arrays_program;

import java.util.*;

public class arr_first_value_print_lase_value_times {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = ip.nextInt();
        int[] data = new int[size];
        for (int index = 0; index < size; index++) {
            System.out.print("Enter Array Value " + (index + 1) + " : ");
            data[index] = ip.nextInt();
        }
        process(data);
    }

    public static void process(int[] data) {
        for (int row_index = 0; row_index < data.length; row_index++) {
            for (int column_imdex = 0; column_imdex < data[((data.length - 1) - row_index)]; column_imdex++) {
                System.out.print(data[row_index]);
            }
            System.out.println();
        }
    }

}
