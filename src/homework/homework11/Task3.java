package homework.homework11;

public class Task3 {
    private static String vowels (String input){

        return input.replaceAll("[^AEEIOYaeiouy]", "");
    }

    public static void main(String[] args) {
        System.out.println(vowels("I love coding in Java"));
    }
}
