package homework.homework21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
        }catch(InputMismatchException ime){
            System.out.println("Invalid Input, it should be a whole number");
        }


    }
}
