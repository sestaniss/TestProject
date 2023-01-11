package class6;

//Write a program to find largest of three double values using if-else..if
// and logical operators provided by a user (numbers must be distinct)

import java.util.Scanner;

public class HomeWorkPractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int A,B,C;
        System.out.println("Please enter three numbers");
        A=scan.nextInt();
        B=scan.nextInt();
        C=scan.nextInt();



        if(A>B && A>C){
            System.out.println(A+" is the largest number");
        }else if(B>A && B>C){
            System.out.println(B+" is the largest number");
        }else if(C>A && C>B){
            System.out.println(C+" is the largest number");
        }

    }
}
