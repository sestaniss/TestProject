package homework.Project1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int [] arr = new int[5];

        System.out.println("Please enter five numbers");
        arr[0]=scan.nextInt();
        arr[1]=scan.nextInt();
        arr[2]=scan.nextInt();
        arr[3]=scan.nextInt();
        arr[4]=scan.nextInt();

        int sum = 0;

        for (int i = 0; i < arr.length ; i++) {
            sum+=arr[i];
        }
        System.out.println("The sum is "+sum);
    }
}
