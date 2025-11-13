import java.util.Scanner;

public class perfect_square {
   static Scanner ip = new Scanner(System.in);

   public static void main(String[] args) {
      System.out.print("\nEnter Value for find squre : ");
      int number = ip.nextInt();
      int perfect_square = 0;

      // It's check user given number is positive or not
      if (number > 0) {
         // It's run loop for user given number /2
         for (int i = 1; i <= number / 2; i++) {
            // It's calculate perfect square
            perfect_square = i * i;
         }
         // It's check perfect square is equal to user given number
         if (perfect_square == number) {
            System.out.println("\n Given Number " + number + " is Perfect Square\n");

         }
         // It's execute when perfect square is not equal to user given number
         else {
            System.out.println("\n Given Number " + number + " is Not Perfect Square\n");
         }
      }
      // It's execute when user given number is negative
      else {
         System.out.println("\nPlease Enter Positive Number\n");
      }
   }
}
