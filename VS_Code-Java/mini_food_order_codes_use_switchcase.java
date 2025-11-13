import java.util.Scanner;

public class mini_food_order_codes_use_switchcase {
     static Scanner ip = new Scanner(System.in);
    static int orderprice = 0;

    public static void main(String[] args) {
        System.out.println("\n\t\t\tWelcome to Food Order APP\n");
        // Mobile Number and OTP Process
        System.out.print("Enter your Mobile Number : ");
        long mobilenum = ip.nextLong();
        // OTP generate process
        int otp = (int) (Math.random() * 999999);
        // Mobile and OTP Display Process
        System.out.println("\n Your Mobile Number : " + mobilenum + "\n Your OTP : " + otp);
        // ***********************************************************************************************************
        // Hotal Name Processs
        System.out.println("\n\t\t\tAgain Welcome to Food Order APP\n");
        System.out.println("\t\t\tAvailabile Hotal\n\n******\t*****\t****\t**\t*\t**\t***\t****\t*****\n");
        System.out.println("\nHotal NO\tHotal NAme");
        System.out.println("\n 1\t\tBuhari  (Non-Veg)\n 2\t\tA&B  (Veg)\n 3\t\tAmma Canteen  (veg)\n\n");
        System.out.print("Enter Hotal Number : ");
        int hotalnum = ip.nextInt();
        // Hotal Name Select process
        switch (hotalnum) {
            // Hotal No 1 Buhari Hotal
            case 1 -> {
                System.out.println("\n\tWelcome to Buhari Hotal\nl");
                System.out.println("Order no\tFood\t\t\tPrice");
                System.out
                        .println(" 1\t\tChicken Biryani\t\t180\n 2\t\tMandi Biryani\t\t250\n 3\t\tChicken Rise\t\t100");
                System.out.print("\nEnter Order Number : ");
                int ordernum = ip.nextInt();
                // Buhari Hotal menu selection
                switch (ordernum) {
                    // Buhari Hotal menu 1
                    case 1 -> {
                        System.out.println("\nOrder Placed : Chicken Biryani\n");
                        System.out.print("Enter Quantity : ");
                        orderprice = ip.nextInt();
                        int Chicken_Biryani = 180;
                        orderprice *= Chicken_Biryani;
                    }
                    // Buhari Hotal menu 2
                    case 2 -> {
                        System.out.println("\nOrder Placed : Mandi Biryani\n");
                        System.out.print("Enter Quantity : ");
                        orderprice = ip.nextInt();
                        int Mandi_Biryani = 250;
                        orderprice *= Mandi_Biryani;
                    }
                    // Buhari Hotal menu 3
                    case 3 -> {
                        System.out.println("\nOrder Placed : Chicken Rise\n");
                        System.out.print("Enter Quantity : ");
                        orderprice = ip.nextInt();
                        int Chicken_Rise = 250;
                        orderprice *= Chicken_Rise;
                    } // Buhari Hotal menu ERROR message
                    default -> {
                        System.out.println("\nonly Avabile food");
                        System.out.println("Order no\tFood\tPrice\n");
                        System.out.println(
                                " 1\t\tChicken Biryani\t\t180\n 2\tMandi Biryani\t\t250\n 3\tChicken Rise\t\t100");
                    }

                }
            }
            // Hotal No 2 A&B Hotal
            case 2 -> {
                System.out.println("\n\tWelcome to A&B Hotal\n");
                System.out.println("Order no\tFood\t\tPrice");
                System.out.println(" 1\t\tDosa\t\t40\n 2\t\tIdli\t\t15\n 3\t\tPongal\t\t100");
                System.out.print("\nEnter Order Number : ");
                int ordernum = ip.nextInt();
                // A&B Hotal Menu selection
                switch (ordernum) {
                    // A&B Hotal Menu 1
                    case 1 -> {
                        System.out.println("\nOrder Placed : Dosa\n");
                        System.out.print("Enter Quantity : ");
                        orderprice = ip.nextInt();
                        int Dosa = 40;
                        orderprice *= Dosa;
                    }
                    // A&B Hotal Menu 2
                    case 2 -> {
                        System.out.println("\nOrder Placed : Idli\n");
                        System.out.print("Enter Quantity : ");
                        orderprice = ip.nextInt();
                        int Idli = 15;
                        orderprice *= Idli;
                    }
                    // A&B Hotal Menu 3
                    case 3 -> {
                        System.out.println("\nOrder Placed : Pongal\n");
                        System.out.print("Enter Quantity : ");
                        orderprice = ip.nextInt();
                        int Pongal = 100;
                        orderprice *= Pongal;
                    }
                    // A&B Hotal Menu ERROR message
                    default -> {
                        System.out.println("\nAvaliable food");
                        System.out.println("Order no\tFood\t\tPrice");
                        System.out.println(" 1\t\tDosa\t\t40\n 2\t\tIdli\t\t15\n 3\t\tPongal\t\t100");
                    }
                }
            }
            // Hotal NO 3 Amma Canteen
            case 3 -> {
                System.out.println("\n\tWelcome to Amma Canteen\n");
                System.out.println("Order no\tFood\t\tPrice");
                System.out.println(" 1\t\tIdli\t\t5\n 2\t\tChappthi\t\t10\n 3\t\tLemon Rice\t\t30");
                System.out.print("\nEnter Order Number : ");
                int ordernum = ip.nextInt();
                // Amma Canteen Menu
                switch (ordernum) {
                    // Amma Canteen Menu1
                    case 1 -> {
                        System.out.println("\nOrder Placed : Idli\n");
                        System.out.print("Enter Quantity : ");
                        orderprice = ip.nextInt();
                        int Idli = 5;
                        orderprice *= Idli;
                    }
                    // Amma Canteen Menu 2
                    case 2 -> {
                        System.out.println("\nOrder Placed : Chappthi\n");
                        System.out.print("Enter Quantity : ");
                        orderprice = ip.nextInt();
                        int Chappthi = 10;
                        orderprice *= Chappthi;
                    }
                    // Amma Canteen Menu 3
                    case 3 -> {
                        System.out.println("\nOrder Placed : Lemon Rice\n");
                        System.out.print("Enter Quantity : ");
                        orderprice = ip.nextInt();
                        int Lemon_Rice = 30;
                        orderprice *= Lemon_Rice;
                    }
                    // Amma Canteen Menu ERROR message
                    default -> {
                        System.out.println("\nAvaliable food");
                        System.out.println("Order no\tFood\t\tPrice");
                        System.out.println(" 1\t\tIdli\t\t5\n 2\t\tChappthi\t\t10\n 3\t\tLemon Rice\t\t30");

                    }
                }
            }
            // Hotal Name Select process ERROR Message
            default -> {
                System.out.println("\nAvaliable Foods");
                System.out.println("Order no\tFood\t\tPrice\n");
                System.out.println(" 1\t\tIdli\t\t5\n 2\t\tChappthi\t\t10\n 3\t\tLemon Rice\t\t30");
            }
            // its its check Price Amount
        }if(orderprice>0){
        // display total price
        System.out.println("\nTotal Orderd Food Price : " + orderprice);

        System.out.println("\nConform your Order Means Press (1) , If Cancle your Means Press (2)");
        System.out.print("\nEnter your Decision for your Food Order (or) Cancle : ");
        int food_order_stage = ip.nextInt();
        // select Food Order conndition
        switch (food_order_stage) {
            // select Order meand
            case 1 -> {
                System.out.println("\nPayment Method\n");
                System.out.println("Option no\tPyment Option\n");
                System.out.println(" 1\t\tGPay\n 2\t\tPhone Pay");
                System.out.print("\nEnter Payment Method : ");
                int Payment_method = ip.nextInt();
                // Select Payment method
                switch (Payment_method) {
                    // payment 1 gpay
                    case 1 -> {
                        System.out.println("\nWelcome GPay\n");
                        System.out.print("Enter Bill Amount : ");
                        int billamount = ip.nextInt();
                        if (billamount == orderprice) {
                            System.out.print("\nEnter OTP Number : ");
                            int conform_otp = ip.nextInt();
                            if (conform_otp == otp) {
                                System.out.println("\t\nOrder Placed");
                            } else {
                                System.out.println("\t\nOTP Not Mached so Order Cancled");
                            }
                        } else {
                            System.out.println("Payment error");
                        }
                    }
                    // payment 1 Phone pay
                    case 2 -> {
                        System.out.println("\nWelcome Phone Pay\n");
                        System.out.print("Enter Bill Amount : ");
                        int billamount = ip.nextInt();
                        if (billamount == orderprice) {
                            System.out.print("Enter OTP Number : ");
                            int conform_otp = ip.nextInt();
                            if (conform_otp == otp) {
                                System.out.println("\t\nOrder Placed");
                            } else {
                                System.out.println("\t\nOTP Not Mached so Order Cancled");
                            }
                        } else {
                            System.out.println("\t\nPayment error");
                        }
                    }
                    //payment selection error
                    default -> {
                        System.out.println("\t\nPayment method Selection Error");
                    }

                }

            }
            // Food order cancled message
            default -> {
                System.out.println("\t\nYour Order Cancled \"Thank You\"");
            }

        }
        
    }
    else{
            System.out.println(" ");
        }
    }

}
