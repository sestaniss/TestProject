package homework.homework8;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter mom’s first name");
        String momName= scan.nextLine().toUpperCase();
        System.out.println("Please enter dad’s first name");
        String dadName= scan.nextLine().toUpperCase();
        System.out.println("Are you expecting boy or girl");
        String baby=scan.nextLine();

        if(baby.equals("boy")) {
            System.out.println(dadName.substring(0,3)+momName.substring(momName.length() -2));
        } else if(baby.equals("girl")) {
            System.out.println(momName.substring(0,2)+dadName.substring(dadName.length() -3));
        } else {
            System.out.println("Invalid input");
        }
    }
}
