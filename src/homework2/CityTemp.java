package homework2;

import java.util.Scanner;

public class CityTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your city");
        String city = input.nextLine();
        System.out.println("Please enter your city current temperature ");
        int F = input.nextInt();
        double C = (F-32) * 0.5556;
        System.out.println("The temperature is "+C+ "The city is "+city);
    }
}
