package class13;

public class SplitMethodDemo {
    public static void main(String[] args) {
        String str="I like java. I Write a lot of code daily. I am from batch 15.";
        String [] strArr=str.split("[.?!]");
        System.out.println(strArr.length);
        System.out.println(strArr[2]);
        //whenever we are working with arrays we use the lenght and whenever we are working with Strings
        // we use the lenght ()
    }
}
