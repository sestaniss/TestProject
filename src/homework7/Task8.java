package homework7;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        String[][] countries = {{"Canada", "USA", "Mexico"},
                {"Brazil", "Ecuador", "Argentina"},
                {"Italy", "Germany", "United Kingdom"},
                {"Indonesia", "Kyrgyzstan", "Vietnam"},
                {"Egypt", "Nigeria", "South Africa"}
        };

        for (String[] countriesList : countries) {
            System.out.println(Arrays.toString(countriesList) + " ");
        }

        System.out.println("**************");

        int total = 0;

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + " ");
                total++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The total number of countries is: "+total);

    }
}
