package class7;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int number=0;
        do{
            System.out.println("Please enter a number");
            number=scanner.nextInt();

        }while (number!=5);

        while (number!=5) {
            System.out.println("Please enter a number");
            number = scanner.nextInt();
        }
    }
}
