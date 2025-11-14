package patterns;
// Enter Pattern Range : 5
// 0 0 0 0 0 
// 1 1 1 1 1
// 0 0 0 0 0
// 1 1 1 1 1
// 0 0 0 0 0
import java.util.*;
public class pt_00_11_00_11 {
    static Scanner ip=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter Pattern Range : ");
        int range=ip.nextInt();
        for(int row =0;row<range;row++){
            for(int column=0;column<range;column++){
                if((row-1)%2==0){
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
