package homework3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1, number2, result;
        char operator;

        System.out.println("Please enter your first number");
        number1 = scan.nextInt();

        System.out.println("Please enter your second number");
        number2 = scan.nextInt();

        System.out.println("Please enter an operator for calculation");
        operator = scan.next() .charAt(0);

        switch (operator){

            case'+':
                result = number1+number2;
                System.out.println(result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(result);
                break;

            case'*':
                result = number1 * number2;
                System.out.println(result);
                break;

            case'/':
                result = number1/number2;
                System.out.println(result);
                break;
            default:
                System.out.println("invalid input");

        }

    }
}
