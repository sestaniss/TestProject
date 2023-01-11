package Class4;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        //Below ine helps us get the input from keyboard
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=input.nextLine(); //nextLine is used when we have to take sentences from the keyboard
        System.out.println("My name is "+name);
    }
}
