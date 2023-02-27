package class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapsDemo5 {
    public static void main(String[] args) {
        Map<Integer, String> studentsMap=new HashMap<>();

        studentsMap.put(1,"Tami");
        studentsMap.put(2,"Sam");
        studentsMap.put(3,"Abeera");
        studentsMap.put(4,"Savo");
        studentsMap.put(5,"Peter");
        studentsMap.put(6,"Saba");
        studentsMap.put(7,"Anush");

        //remove all the keys from above map if they are greater than 2

        Set<Integer> keys=studentsMap.keySet();
        keys.removeIf(x->x>2);
        System.out.println(keys);
        System.out.println(studentsMap);

       /* Iterator<Integer> it=studentsMap.keySet().iterator();
        while(it.hasNext()){
            if(it.next()>2){
                it.remove();
            }
        }
        System.out.println(studentsMap);*/

       // studentsMap.keySet().removeIf(x -> x>2);


    }
}
