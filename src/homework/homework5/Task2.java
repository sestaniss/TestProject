package homework.homework5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {
            System.out.println("Would you like to  apply for a credit card");
            if (scan.nextLine().equals("yes")){
                break;
            }

        }



    }
}
