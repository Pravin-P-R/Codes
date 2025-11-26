package Arrays_program;

import java.util.*;

public class arr_matrix_pattern {
   public static void main(String[] args) {
      Scanner ip = new Scanner(System.in);
      System.out.print("Enter Array Size : ");
      int size = ip.nextInt();
      int[] matrix = new int[size];
      for (int index = 0; index < size; index++) {
         System.out.print("Enter Array Value " + (index + 1) + " : ");
         matrix[index] = ip.nextInt();
      }
      process(matrix);
   }

   public static void process(int[] mat) {
      for (int row_index = 0; row_index < mat.length; row_index++) {
         for (int column_imdex = row_index + 1; column_imdex < mat.length; column_imdex++) {
            System.out.print("( " + mat[row_index] + " , " + mat[column_imdex] + " )");
         }
         System.out.println();
      }
   }
}
