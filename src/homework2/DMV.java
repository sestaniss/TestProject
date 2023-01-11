package homework2;

import java.util.Scanner;

public class DMV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = input.nextInt();
        if (age>=18) {
            System.out.println("You are eligible for a driver license");
        }else {
            System.out.println("Recommended to apply for a learners permit first");
        }
    }
}
