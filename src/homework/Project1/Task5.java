package homework.Project1;

public class Task5 {
    public static void main(String[] args) {
        int[][] numbers = {{2,5,6,9,10},
                {12,15,16,19,20}
        };

        int sumEven=0;
        int sumOdd=0;

        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                if (numbers[i][j]%2==0) {
                    sumEven += numbers[i][j];
                }else {
                    sumOdd += numbers[i][j];
                }
            }

        }
        System.out.println("The sum of Even numbers is "+sumEven);
        System.out.println("The sum of Odd numbers is "+sumOdd);

    }
}
