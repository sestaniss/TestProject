package homework.homework20;

import java.util.Collection;
import java.util.LinkedList;

public class Task4 {
    /*
    Create the collection that will store single unique Objects of a String type in which order is preserved.
    Write a logic to concatenate all string from the collection.
     */

    public static void main(String[] args) {
        Collection<String> uniqueObj=new LinkedList<>();
        uniqueObj.add("Shazam");
        uniqueObj.add("Black Adam");
        uniqueObj.add("Sam E");
        uniqueObj.add("Tami E");
        uniqueObj.add("Super Man");

        for (String objects:uniqueObj){
            System.out.print(objects+" ");
        }
    }
}
