package homework.homework10;

public class Task1 {
    /*
    1) Create a method that will take 2 parameters as a numbers and prints which number is larger.
     */

     int largerNumber (int number1,int number2){
         if (number1>number2){
             return number1;
         }else {
             return number2;
         }
     }


    public static void main(String[] args) {
        Task1 number = new Task1();
        System.out.println(number.largerNumber(28,34));
    }

}
