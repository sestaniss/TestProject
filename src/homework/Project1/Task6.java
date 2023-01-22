package homework.Project1;

public class Task6 {
    public static void main(String[] args) {

        int a =5;
        int b=10;

        System.out.println("Before tha swap, the first number is " +a+ " and the second number is "+b);

        a= a+b;
        b=a-b;
        a=a-b;

        System.out.println("After tha swap, the first number is " +a+ " and the second number is "+b);


    }
}
