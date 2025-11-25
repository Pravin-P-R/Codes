package Arrays_program;

import java.util.*;
public class merge_two_array_into_one_array {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter Array Table 1 Size : ");
        int table1_size = ip.nextInt();
        System.out.print("Enter Array Table 2 Size : ");
        int table2_size = ip.nextInt();
        int[] arr_table_1 = new int[table1_size];
        int[] arr_table_2 = new int[table2_size];

        int i = 0, j = 0;
        while (i < table1_size || j < table2_size) {
            if (i < table1_size) {
                System.out.print("Enter Array1 Value : ");
                arr_table_1[i] = ip.nextInt();
                i++;
            }

            else if (j < table2_size) {
                System.out.print("Enter Array2 Value : ");
                arr_table_2[j] = ip.nextInt();
                j++;
            }
        }
        process(arr_table_1, arr_table_2);
    }

    public static void process(int[] arr1, int[] arr2) {
        int[] merge_arr_table = new int[arr1.length + arr2.length];
        for (int index1 = 0, index2 = 0; index1 < merge_arr_table.length; index1++) {
            if (index1 < arr1.length) {
                merge_arr_table[index1] = arr1[index1];
            } else {
                merge_arr_table[index1] = arr2[index2];
                index2++;
            }
        }
        System.out.println("Merged Array : " + Arrays.toString(merge_arr_table));
    }
}
