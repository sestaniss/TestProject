package class9;

import java.util.Scanner;

public class RecapTask2 {
    public static void main(String[] args) {
        /*
        Create a programe that will be asking user to apply for credit card 10
        times. as soon as you get a "yes" from a user program should stop asking.
         */

        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Do you want a credit card");
            String userResponse=scanner.next();
            if (userResponse.equalsIgnoreCase("yes")){
                break;
            }

        }
    }
}
