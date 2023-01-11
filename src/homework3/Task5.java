package homework3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double A,B,C;
        System.out.println("Please enter three numbers");
        A=scan.nextDouble();
        B=scan.nextDouble();
        C=scan.nextDouble();



        if(A>B && A>C){
            System.out.println(A+" is the largest number");
        }else if(B>A && B>C){
            System.out.println(B+" is the largest number");
        }else if(C>A && C>B){
            System.out.println(C+" is the largest number");
        }



    }
}
