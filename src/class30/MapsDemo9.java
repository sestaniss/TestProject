package class30;

import java.util.Map;
import java.util.TreeMap;

public class MapsDemo9 {
    public static void main(String[] args) {
        Map<String, String> countries=new TreeMap<>();
        countries.put("Egypt", "Cairo");
        countries.put("France", "Paris");
        countries.put("Kyrgyzstan", "Bishkek");
        countries.put("USA", "Washington DC");
        countries.put("Italy", "Rome");

        var values=countries.values();
        for (var value:values){
            System.out.println(value);
        }

        var iterator=countries.values().iterator();
        while (iterator.hasNext()){

            var value=iterator.next();
            System.out.println(value);
        }
    }
}
