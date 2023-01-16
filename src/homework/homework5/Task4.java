package homework.homework5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What would you like to buy");
        String item= scan.nextLine();

        System.out.println("How much does it cost");
        int price= scan.nextInt();


        while (price>0) {
            System.out.println("Please enter your payment amount");
            int money= scan.nextInt();

            price=price-money;

            if (price>0){
                System.out.println("Your remaining amount to pay is "+price);
            } else {
                System.out.println("Your change is "+price);
            }
        }
        System.out.println("Thank you for shopping");
    }
}
