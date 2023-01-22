package homework.homework7;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        String [][] cars={{"American","German","Korean","Italian"},
                           {"Dodge", "BMW", "Hyundai", "Alfa Romeo"}
        };

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("*************************");

        for (String [] car: cars) {
            System.out.println(Arrays.toString(car)+" ");

        }

    }
}
