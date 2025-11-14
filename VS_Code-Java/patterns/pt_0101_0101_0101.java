package patterns;
// Enter Pattern Range : 5
// 0 1 0 1 0 
// 0 1 0 1 0
// 0 1 0 1 0
// 0 1 0 1 0
// 0 1 0 1 0
import java.util.Scanner;

public class pt_0101_0101_0101 {
    static Scanner ip=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter Pattern Range : ");
        int range=ip.nextInt();
        for(int row =0;row<range;row++){
            for(int column=0;column<range;column++){
                if((column+1)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    } 
}
