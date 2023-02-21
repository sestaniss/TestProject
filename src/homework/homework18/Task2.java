package homework.homework18;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("Hyundai");
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Alfa Romeo");
        cars.add("Land Rover");

        System.out.println(cars);
        System.out.println("**********************************************************");

        for(String car:cars){
            System.out.print(car+" ");
        }
        System.out.println();
        System.out.println("**********************************************************");

        Iterator<String> iterator= cars.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
