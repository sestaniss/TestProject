package homework.homework3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter grade");
        char grade= scan.next() .charAt(0);

        if(grade=='A'){
            System.out.println("Excellent");
        }else if(grade=='B') {
            System.out.println(grade+" is Good");
        }else if(grade=='C') {
            System.out.println(grade+" is Average");
        }else if(grade=='D') {
            System.out.println(grade+" is Bad");
        }else {
            System.out.println(grade+" is Not Acceptable");


        }

    }
}
