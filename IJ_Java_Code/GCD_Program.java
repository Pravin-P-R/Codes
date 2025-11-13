import java.util.*;
public class GCD_Program {
    static Scanner ip=new Scanner(System.in);
    public static void main(String [] ignoredArgs){
        System.out.print("Enter First Number: ");
        int firstnumber=ip.nextInt();
        System.out.print("Enter Second Number: ");
        int secondnumber=ip.nextInt();
        // find smallest number to user given first number & second number
        int smallestnum;
        if

        (firstnumber < secondnumber) smallestnum = firstnumber;
        else smallestnum = secondnumber;
        int gcdnum=0;
        // loop run height to finding smallest number
        for(int i=1;i<=smallestnum;i++){
            if(firstnumber%i==0 && secondnumber%i==0){ //it's check user given both number gratest common diviser
                gcdnum=i;
            }
        }
        System.out.print("GCD Number of "+firstnumber+" & "+secondnumber+" Bigest Diviser : "+gcdnum);
    }
}
