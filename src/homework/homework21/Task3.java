package homework.homework21;

public class Task3 {
    public static void eligibility (int age){
        if(age<16){
            throw new RuntimeException("Not qualified age");
        }else{
            System.out.println("Qualified age");
        }
    }

    public static void main(String[] args) {

        /*
        3) Create a method to check age eligibility that will throw a runtime exception.
        Method should throw an exception age is less than 16.
         */

        eligibility(24);

    }
}
