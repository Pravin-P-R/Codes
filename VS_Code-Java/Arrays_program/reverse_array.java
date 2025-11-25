package Arrays_program;

// import java.util.Arrays;
// import java.util.Scanner;
import java.util.*;
public class reverse_array {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = ip.nextInt();
        int[] arr = new int[size];
        for (int index = 0; index < size; index++) {
            System.out.print("Enter Array value "+index+1+" : ");
            arr[index] = ip.nextInt();
        }
        process(arr);
    }

    public static void process(int[] arr) {
        int start_index = 0, end_index = arr.length - 1;

        while (start_index < end_index) {
            int temp = arr[start_index];
            arr[start_index] = arr[end_index];
            arr[end_index] = temp;

            start_index++;
            end_index--;
        }
        System.out.print(Arrays.toString(arr));
    }
}
