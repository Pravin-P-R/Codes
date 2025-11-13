import java.util.Scanner;

public class convert_binary__to__decimal {
    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {

        // User Given Binary Value
        System.out.print("Enter Binary Number : ");
        int binarynum = ip.nextInt();

        // Alucate Store Decimal Number And set x variable
        int temp_binary_value=binarynum;
        int decimalnum = 0, x = 1;

        // This Loop Convert Binary to Decimal Value
        while (binarynum != 0) {
            decimalnum += (binarynum % 10 * x);
            binarynum /= 10;
            x *= 2;
        }
        // Output Section
        System.out.print("Given Binary Number : "+temp_binary_value+" It's Decimal Number : " + decimalnum+"\n");
    }
}
