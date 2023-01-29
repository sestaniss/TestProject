package homework.homework10;

public class Task5 {
    /*
    5) Write a method to return whether given number is prime or not?
     */
    String prime(int number){
        int count=0;

        for (int i = 1; i <= number ; i++) {
            if (number%i==0) {
                count++;
            }
        }

        if(count==2) {
            return "The given number is Prime";
        } else {
          return   "The given number is Not Prime";
        }
    }

    public static void main(String[] args) {
        Task5 num = new Task5();
        System.out.println(num.prime(7));

    }
}
