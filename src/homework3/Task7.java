package homework3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your country");
        String country = scan.next();

        switch (country) {

            case "France":
                System.out.println("French");
                break;

            case "USA":
                System.out.println("English");
                break;

            case "Egypt":
                System.out.println("Arabic");
                break;
            case "Italy":
                System.out.println("Italian");
                break;
            case "Greece":
                System.out.println("Greek");
                break;
            default:
                System.out.println("Wrong country");
        }
    }
}
