package homework.homework20;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    /*
    3)Create a Map that will store Employee name and salary.
      Write a logic to retrieve an employee who gets the highest salary.
      Output should be in the below format
      John Smith=$100000
     */

    public static void main(String[] args) {
        Map<String, Integer> employees=new HashMap<>();
        employees.put("Tami", 270000);
        employees.put("Sam", 285000);
        employees.put("Zafar", 166000);
        employees.put("Yulila", 198000);

        var employee=employees.entrySet();
        int highest=0;
        String emp="";
        for(var e:employee){
            if(e.getValue()>highest){
                highest=e.getValue();
                emp=e.getKey();
            }
        }
        System.out.println(emp+"=$"+highest);
    }
}
