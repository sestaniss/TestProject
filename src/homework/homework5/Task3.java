package homework.homework5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers for the start and end point in a range");
        int number1= scan.nextInt();
        int number2= scan.nextInt();
        int sumEven = 0;
        int sumOdd=0;

        for (int i =number1 ; i <= number2 ; i++) {
            if (i%2==0){
                sumEven=sumEven+i;
            }
        }
        System.out.println(sumEven);

        for (int i =number1 ; i <= number2 ; i++) {
            if (i%2!=0){
                sumOdd=sumOdd+i;
            }
        }
        System.out.println(sumOdd);



    }
}
