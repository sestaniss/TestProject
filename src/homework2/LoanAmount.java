package homework2;

import java.util.Scanner;

public class LoanAmount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the amount needed?");
        int loan=input.nextInt();

        if (loan<=200000) {
            System.out.println("Congratulations you are approved for the loan");
        }else {
            System.out.println("you are not approved for the loan");
        }
    }
}
