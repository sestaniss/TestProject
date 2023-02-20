package class27;

import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        // add method to add elements to this arraylist
        names.add("Sam");
        names.add("tami");
        names.add("Nelson");
        names.add("Abeera");
        names.add("Yulia");
        names.add("Savo");

        System.out.println(names);
        names.clear();
        System.out.println(names);
    }
}
