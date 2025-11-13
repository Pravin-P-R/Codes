import java.util.Scanner;

public class convert_decimal__to___binary {
    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {

        // User Input get Decimal Input
        System.out.print("Enter Decimal Value : ");
        int decimal_number = ip.nextInt();

        // Its String Datatype Store Binary Value
        String binary_number = "";

        // It's Store user given decimal value
        // It's temp_decimal_number use my Extra Purpose
        int temp_decimal_number = decimal_number;

        // It's convert Decimal Value to Binary Value
        while (decimal_number != 0) {
            binary_number = decimal_number % 2 + binary_number;
            decimal_number /= 2;
        }
        // Output Section
        System.out.println("\nGiven Decimal Number : " + temp_decimal_number + " It's Binary Number : " + binary_number+"\n");
    }
}
