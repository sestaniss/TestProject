package homework.homework9;

public class Task3 {
    public static void main(String[] args) {

        String str = "Is it saturday? Is it raining? Do we have a Java Class today?";
        /*String [] strArr=str.split("[.?!]");
        System.out.println("There are "+strArr.length+" sentences in this string");
        System.out.println(strArr[2]);*/
        System.out.println(str.split("[?]").length);
    }
}
