package homework.Project1;

import java.util.Scanner;

public class Task2WhileLoop {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        String[] countries = new String[5];
        System.out.println("Please enter five countries");

        countries[0] = Scan.nextLine();
        countries[1] = Scan.nextLine();
        countries[2] = Scan.nextLine();
        countries[3] = Scan.nextLine();
        countries[4] = Scan.nextLine();
        int i = 0;
        while (i < countries.length) {
            if (countries[i].equals("Egypt")){
                System.out.println("The Capital is Cairo");
            } else if (countries[i].equals("France")) {
                System.out.println("The Capital is Paris");
            } else if (countries[i].equals("Canada")) {
                System.out.println("The Capital is Ottawa");
            } else if (countries[i].equals("USA")) {
                System.out.println("The Capital is Washington D.C");
            } else if (countries[i].equals("Italy")) {
                System.out.println("The Capital is Rome");
            }
            i++;



        }
    }
}
