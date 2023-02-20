package class28;


import class26.Dog;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class GenericArrayList {
    public static void main(String[] args) {

      //  ArrayList<String> name=new ArrayList<>();

       // below is a none generic array list, not a good practice -> (Old way of coding)
        Object a=new String("some value");
        Object b=new Integer(10);
        Object c=new Scanner(System.in);

        // No one now uses the arrays like this.
        ArrayList name=new ArrayList();
        name.add("Sam");
        name.add(10);
        name.add('a');
        name.add(new Dog("Jacky", "Green", "unknown"));

        for (Object j:name){
            ((String)j).trim();
        }
    }
}
