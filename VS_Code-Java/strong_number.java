import java.util.Scanner;

public class strong_number {
    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        // Its Get input number user
        System.out.print("Enter Number : ");
        int number = ip.nextInt();
        // Logic to check Strong Number and sum of factorial of digits
        int temp_number = number, sem = 0;
        // Loop to extract each digit and calculate factorial
        while (temp_number != 0) {
            // Extract last digit
            int temp = temp_number % 10;
            // Calculate factorial of digit
            int poduct = 1;
            // Loop to calculate factorial
            for (int i = 1; i <= temp; i++) {
                poduct *= i;
            }
            // Sum of factorials
            sem += poduct;
            // Remove last digit
            temp_number /= 10;
        }
        // Print Strong Number or Not
        System.out.println(
                "\nGiven Number : " + number + ((sem == number) ? " Strong Number\n" : " Not a Strong Number\n"));
    }
}
