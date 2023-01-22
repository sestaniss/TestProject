package homework7;

public class Task6 {
    public static void main(String[] args) {

        int[][] numbers = {{10, 15, 22},
                           {25, 44, 60},
                            {20, 8, 32}
        };

        int sum=0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {
                sum+=numbers[i][j];
            }
        }
        System.out.println("The sum is "+sum);
    }
    }

