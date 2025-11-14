package patterns;
// Enter Pattern Range : 5
// 0 
// 1 1
// 2 2 2
// 3 3 3 3
// 4 4 4 4 4
import java.util.Scanner;

public class pt_1_12_123_1234 {
    static Scanner ip=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Pattern Range : ");
        int range=ip.nextInt();
        for(int row =0;row<range;row++){
            for(int column=0;column<range;column++){
                if(column<=row){
                    System.out.print(row+" ");
                }
            }
            System.out.println();
        }
    }
}
