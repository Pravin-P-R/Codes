package patterns;
// Enter Pattern Range : 5
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
import java.util.Scanner;
public class pt_0_11_222_3333_44444 {
    static Scanner ip=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Pattern Range : ");
        int range=ip.nextInt();
        for(int row =0;row<range;row++){
            for(int column=0;column<range;column++){
                if(column<=row){
                    System.out.print((column+1)+" ");
                }
            }
            System.out.println();
        }
    }
}
