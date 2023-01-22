package homework.homework7;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        String [][] groceries={{"Strawberries","Banana","Orange"},
                              {"Creamer","Cheese","Yogurt"},
                              {"Onions","Cucumbers","Broccoli"},
        };
        for (int i = 0; i < groceries.length; i++) {
            for (int j = 0; j < groceries[i].length; j++) {
                System.out.println(groceries[i][j]+" ");
            }
        }
        System.out.println("*************************");

        for (String [] groceryList: groceries) {
            System.out.println(Arrays.toString(groceryList)+" ");
        }

    }
}
