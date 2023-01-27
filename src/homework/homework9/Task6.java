package homework.homework9;

public class Task6 {
    public static void main(String[] args) {

        String a = "Rabbits";
        String b = "Chicken";

        System.out.println("Before swap: "+a+" and "+b);

        a=a+b;
        b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length());

        System.out.println("After swap: "+a+" and "+b);
    }
}
