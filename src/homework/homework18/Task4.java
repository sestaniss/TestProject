package homework.homework18;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("tea");
        drinks.add("Coffee");
        drinks.add("cocktail");
        drinks.add("juice");
        drinks.add("Whiskey");

        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("a") || drinks.get(i).contains("e")){
                drinks.set(i,"water");
            }
        }
        System.out.println(drinks);
    }
}
