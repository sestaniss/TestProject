package class28;


import java.util.LinkedList;

public class LinkedListsDemo {
    public static void main(String[] args) {

        LinkedList<String> names=new LinkedList<>();
        names.add("Sam");
        names.add("Tami");
        names.add("Abeera");
        names.add("Niko");
        System.out.println(names);

        for (String name:names){
            System.out.println(name);
        }

    }
}
