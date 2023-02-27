package class29;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapDemo {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> groceries=new LinkedHashMap<>();
        groceries.put("Eggs", 10);
        groceries.put("Milk", 5);
        groceries.put("Bread", 5);
        groceries.put("rice", 6);
        groceries.put("Meat", 7);
        groceries.put("Soap", 5);

        System.out.println(groceries.get("Rice"));
        System.out.println(groceries);

        System.out.println(groceries.isEmpty());
        System.out.println(groceries.size());
        groceries.remove("Meat");
        System.out.println(groceries);
    }
}
