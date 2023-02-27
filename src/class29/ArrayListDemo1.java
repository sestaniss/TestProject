package class29;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

       // Dog d1=new Dog("Jacky", "Persian", 15);

        ArrayList<Dog> dogs=new ArrayList<>();
        dogs.add(new Dog("Jacky", "Persian", 15));
        dogs.add(new Dog("Nickou", "Maltese", 6));
        dogs.add(new Dog("Jimmi", "BullDog", 15));
        dogs.add(new Dog("Lili", "Unknown", 10));

        for (Dog d:dogs){
            d.printDogName();
        }

    }
}
