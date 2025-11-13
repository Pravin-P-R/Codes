import java.util.Scanner;

public class find_happy_Number_not {
    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        // Get Input From User
        System.out.print("Enter Number : ");
        int number = ip.nextInt();
        // its store sum of square of digit
        int sum = 0;
        // It's Loop Until number become 1 or 4
        while (number != 1 && number != 4) {
            // calculate sum of square of digit
            while (number > 0) {

                // extract last digit and square it and add to sum
                sum += (number % 10) * (number % 10);

                // remove last digit
                number /= 10;

            }
            // assign sum to number
            number = sum;
            // reset sum
            sum = 0;
        }
        // print result
          System.out.println("\nGiven Number : " + number + " It's : "+((number == 1) ? "Happy Number" : "Not Happy Number"));
            }
}
