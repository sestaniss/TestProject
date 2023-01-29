package homework.homework10;

public class Task2 {
    /*
    2) Create a method that will take a number and prints whether the number is even or odd.
     */

    String evenOrOdd (int number){
        if (number%2==0){
            return "the number is even";
        }else {
            return "the number is odd";
        }
    }

    public static void main(String[] args) {
        Task2 number = new Task2();
        System.out.println(number.evenOrOdd(28));
    }



}
