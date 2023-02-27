package homework.homework20;

import java.util.Collection;
import java.util.LinkedList;

public class Task5 {
    /*
    Create a collection of integers in which you can keep duplicates.
    Write a logic to find sum of all integers
     */

    public static void main(String[] args) {
        Collection<Integer> numbers=new LinkedList<>();
        numbers.add(28);
        numbers.add(34);
        numbers.add(28);
        numbers.add(88);
        numbers.add(66);
        numbers.add(34);
        numbers.add(22);

        int sum=0;
        for (Integer num:numbers) {
            sum+=num;
        }
        System.out.println(sum);
    }
}
