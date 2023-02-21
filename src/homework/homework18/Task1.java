package homework.homework18;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("Sam");
        names.add("Tami");
        names.add("Abeera");
        names.add("Yuliya");
        names.add("Savo");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Sam"));
        System.out.println(names.size());
    }
}