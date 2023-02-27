package homework.homework20;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        /*
        1) Create a map of Best Buy store. Place
           item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
           Retrieve all keys and values from a Best Buy map using EntrySet.
         */
        Map<Integer, String> bestBuyMap=new HashMap<>();

         bestBuyMap.put(110,"KeyBoard");
         bestBuyMap.put(85,"Mouse");
         bestBuyMap.put(262,"Monitor");
         bestBuyMap.put(164,"Head-Set");

          var entrySet=bestBuyMap.entrySet();

        for(var entry:entrySet){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
