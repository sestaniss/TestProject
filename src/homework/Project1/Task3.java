package homework.Project1;

public class Task3 {
    public static void main(String[] args) {


        int[][] numbers = {{2,4,6,8,10},
                           {12,14,16,18,20}
        };

        int sum=0;

        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                sum+=numbers[i][j];

            }

        }
        System.out.println("The sum is "+sum);

    }
}
