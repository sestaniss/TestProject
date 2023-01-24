package homework.homework8;

public class Task1 {
    public static void main(String[] args) {

        String str = "Winter Is Coming ";
        int middleChar = str.length() / 2;

        if (!str.isEmpty()) {
            if (str.length() % 2 != 0 && str.length() > 3) {
                System.out.println(str.charAt(middleChar));
            }
        }

    }
}