package Arrays_program;

import java.util.*;

public class missing_number {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = ip.nextInt();
        int[] data = new int[size];
        for (int index = 0; index < size; index++) {
            data[index] = ip.nextInt();
        }
        process(data);
    }

    public static void process(int[] arr) {
        Arrays.sort(arr); // Must sort to find missing in sequence

        int expected = arr[0]; // Start from the first number in array

        for (int i = 0; i < arr.length; i++) {
            // Print all missing numbers before current arr[i]
            while (expected < arr[i]) {
                System.out.print(expected + " ");
                expected++;
            }
            expected++; // Move to next expected after matching arr[i]
        }
    }
}