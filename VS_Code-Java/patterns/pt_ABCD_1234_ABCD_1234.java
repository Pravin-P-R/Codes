package patterns;
// Enter Pattern Range : 5
// A B C D E 
// 1 2 3 4 5
// A B C D E
// 1 2 3 4 5
// A B C D E
import java.util.Scanner;

public class pt_ABCD_1234_ABCD_1234 {
    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Pattern Range : ");
        int range = ip.nextInt();
        for (int row = 0; row < range; row++) {
            char letter = 'A';
            for(int column=0;column<range;column++){
                
                if((row+1)%2==1){
                    System.out.print(letter++ +" ");
                }
                else{
                    System.out.print(column+1+" ");
                }
            }
            System.out.println();
        }
    }
}
