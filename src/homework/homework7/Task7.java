package homework.homework7;

public class Task7 {
    public static void main(String[] args) {

        int[][] numbers = {{10, 15, 22,6},
                           {25, 44, 60,7},
                           {20, 8, 32,9}
        };
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0) {
                    System.out.print(numbers[i][j] + " ");
                }
            }
        }
        System.out.println();
    }








    }

