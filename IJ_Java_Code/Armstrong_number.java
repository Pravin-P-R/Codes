import java.util.*;
public class Armstrong_number {
    static Scanner ip=new Scanner (System.in);
    public static void main(String[] args){
        System.out.print("Enter Armstrong Number : ");
        int armstrongnum=ip.nextInt();
        int count=0,temp_armsterong=armstrongnum,sum=0;
        while(temp_armsterong!=0){
            count++;
            temp_armsterong/=10;
        }
        temp_armsterong=armstrongnum;
        while (temp_armsterong!=0){
            int lastval=temp_armsterong%10;
            int product_start_value=1;
            for(int i=1;i<=count;i++){
                product_start_value*=lastval;
            }
            sum+=product_start_value;
            temp_armsterong/=10;
        }
        System.out.println("\nGiven Nimber : "+armstrongnum+" This Number iS : "+((sum==armstrongnum)?"Armststrong":"Not Armstrong"));
    }
}
