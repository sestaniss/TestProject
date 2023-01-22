package class11;

public class Example {

    public static void main(String[] args) {

        int num1=10;
        int num2=20;

    int [][] matrix={{10,20,30},
            {45,55,66},
            {30,40,20,10,25}
    };

    //foreach loop to print all the numbers from a 2D Array
    for (int[] arr:matrix){

        for(int number:arr){
            System.out.println(number+" ");
        }
        System.out.println();
    }

    }
}
