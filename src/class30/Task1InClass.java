package class30;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task1InClass {
    public static void main(String[] args) {
        /*
        Create a map of countries with its capital that will store countries in alphabetical order.
        Print all keys and values from a country map using for each loop and iterator.
        Print all values from a country map using for each loop and iterator.
         */
        Map<String, String> countries=new TreeMap<>();
        countries.put("Egypt", "Cairo");
        countries.put("France", "Paris");
        countries.put("Kyrgyzstan", "Bishkek");
        countries.put("USA", "Washington DC");
        countries.put("Italy", "Rome");

        //Set<Entry<String, String>> entrySet=countries.entrySet();
        var entrySet=countries.entrySet();

        for (var entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        var iterator=countries.entrySet().iterator();

        while (iterator.hasNext()){

            var entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
