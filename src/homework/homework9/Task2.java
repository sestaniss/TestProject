package homework.homework9;

public class Task2 {
    public static void main(String[] args) {

        String str="jnfjdnJNJFD87687&*(()";
        System.out.println(str.replaceAll("[^A-Za-z0-9]","").length());

    }
}
