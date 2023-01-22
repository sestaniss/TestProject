package homework.Project1;

public class Task8 {
    public static void main(String[] args) {

        int number1=0, number2=1, sum=0;

        System.out.print(number1+" "+number2);

        for (int i =2; i <10 ; i++) {
            sum=number1+number2;
            System.out.print(" "+sum);
            number1=number2;
            number2=sum;

        }














    }
}
