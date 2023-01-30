package homework.homework11;

public class Task3 {
    private String vowels (String input){
        return input.replaceAll("[^aeiouy]", "");
    }

    public static void main(String[] args) {
        Task3 newStr = new Task3();
        System.out.println(newStr.vowels("I love coding in Java"));
    }
}
