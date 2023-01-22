package homework.Project1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter a number");
        int num= scan.nextInt();

        int count=0;

        for (int i = 1; i <= num ; i++) {
            if (num%i==0) {
                count++;
            }
        }

        if(count==2) {
            System.out.println("The given number is Prime");
        } else {
            System.out.println("The given number is Not Prime");
        }


    }
}
