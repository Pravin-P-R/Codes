import java.util.Scanner;

public class spy_number_not {
    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        // Get Input From User
        System.out.print("\nEnter You Checked Spy Number : ");
        int spynum = ip.nextInt();
        // sum and multipled value store variable
        int sum = 0, multipled_spy_value = 1;
        // temp variable to store spy number value
        int temp_store_spy_value = spynum;
        // loop until temp variable become 0
        while (temp_store_spy_value != 0) {
            // calculate sum and multipled value of digit
            sum += temp_store_spy_value % 10;
            multipled_spy_value *= temp_store_spy_value % 10;
            // remove last digit
            temp_store_spy_value /= 10;
        }
        // print result
        System.out.println("\nGiven Number : " + spynum);
        System.out.println("\nIt is a : " + ((sum == multipled_spy_value) ? "Spy Number\n" : "Not Spy number\n"));

    }
}
