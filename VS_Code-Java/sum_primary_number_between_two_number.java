import java.util.Scanner;

public class sum_primary_number_between_two_number {

    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("\nEnter Small Value of Start Prime Number : ");
        int smallnum = ip.nextInt();

        System.out.print("\nEnter Big value of End Prine Nember : ");
        int bignum = ip.nextInt();

        // finded each prime number to store string datatype
        // sum variable help store prime value, temp used my perpose based on give (,)
        int sum = 0, temp = 0;

        // its my extra purpes to store finding prime number
        String primevalue = "";

        // loop run small value to big value numbers to find prime number
        for (int i = smallnum; i <= bignum; i++) {
            // boolean variable each time check true & false
            boolean isprime = true;
            // i store finded prine numbers based user given two number
            for (int j = 2; j <= i / 2; j++) {
                // this if condition chech get reminder
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }

            // this if condition check boolean values true & false but its act only 
            // when value it's [ True ]
            if (isprime && i > 1) {
                // this if condition check temp value 0 or not
                if (0 == temp) {
                    temp = 1;

                    // its my extra purpes to store finding prime number
                } else {
                    primevalue += ", ";
                }
                // this section help to store finded prime number based on user given two number
                primevalue = primevalue + i;
                sum += i;
            }

        }
        // final output section
        // print user given two number
        System.out.println("\nYou given Start Prime Value : " + smallnum + " End Prime number : " + bignum);
        // its my extra purpes to store finding prime number
        System.out.println("\nIt's Between Prime Numbers :  " + primevalue);
        // sum variable help store prime value
        System.out.println("\nTotal Sum of  Between Prime Number : " + sum + "\n");
    }
}
