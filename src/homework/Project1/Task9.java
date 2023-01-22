package homework.Project1;

public class Task9 {
    public static void main(String[] args) {

        int [] numbers={4,7,10,13,16};

        int minimum=numbers[0];
        int maximum=numbers[0];


        for (int i = 0; i < numbers.length ; i++) {

            if (numbers[i] < minimum){
                minimum=numbers[i];
            }

            if (numbers[i] > maximum){
                maximum=numbers[i];

            }

        }
        System.out.println("The minimum number is "+minimum);
        System.out.println("The maximum number is "+maximum);

    }
}
