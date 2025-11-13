import java.util.Scanner;

public class find_max_and_min_number {
    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        //It's set the limit for finding max and min number
        System.out.print("Enter Limit Number : ");
        int Limit = ip.nextInt();
        //Initial max and min number
        int max_num = 0, min_num = 2000;
        //loop get number from user and check for max and min number
        for (int i = 1; i <= Limit; i++) {
            //Taking number from user
            System.out.print("Enter " + i + " Number : ");
            int check_number = ip.nextInt();
            //Check for max number then set max number
            if (check_number >= max_num) {
                max_num = check_number;
                //Check for min number then set min number
            } else if (check_number <= min_num) {
                min_num = check_number;
            }
        }
        //Print max and min number
        System.out.println("\nMaximum Number is : " + max_num);
        System.out.println("\nMinimum Number is : " + min_num);
    }
}
