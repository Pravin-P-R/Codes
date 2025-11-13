import java.util.Scanner;

public class Find_Happynumner_not {
    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        int number = ip.nextInt();
        int sum = 0, temp_display_num = number;
        while (number != 1 && number != 4) {
            while (number > 0) {
                int temp = number % 10;
                sum += temp * temp;
                number /= 10;
            }
            number = sum;
            sum = 0;
        }
        System.out.println("\nGiven Number : " + temp_display_num);
        if (number == 1) {
            System.out.println("\nIt's Happy Number");
        } else {
            System.out.println("\nIt's Not Happy Number");
        }

    }
}
