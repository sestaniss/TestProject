package homework.Project1;

public class Task4 {
    public static void main(String[] args) {

        int[][] numbers = {{2, 4, 5, 9, 10},
                {12, 15, 17, 18, 21}
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]%2==0){
                    System.out.println(numbers[i][j]);

                }
            }
        }
    }
}