package homework2;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many years you have worked in the company?");
        int years = input.nextInt();

        System.out.println("What is your annual salary?");
        int salary = input.nextInt();

        if (years>=5) {
            System.out.println("You are eligible for bonus");
            if (salary>50000) {
                System.out.println("your bonus is $5000");
            }else {
                System.out.println("your bonus is $3000");
            }
        }else {
            System.out.println("You are not eligible for bonus");
        }


    }
}
