package homework3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a, b, c;
        System.out.println("Please enter three numbers");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();



        if(a>b){
            if(a>c){
                System.out.println(a+" is the largest number");
            }

        } if(b>a){
            if (b>c){
                System.out.println(b+" is the largest number");
            }

        }if(c>a){
            if (c>b){
                System.out.println(c+" is the largest number");
            }
        }

    }
}
