package class17;

public class Task2InClass {
    static String reverseStr(String input) {
        return new StringBuilder(input).reverse().toString();
        /*
        Static methods can be called by just writing the name of the class method name.
         */

    }

    public static void main(String[] args) {
        /*
        ie we are within the same class we don`t need the class name as well.
         */
        System.out.println(reverseStr("Habibi"));
    }
}