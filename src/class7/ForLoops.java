package class7;

public class ForLoops {
    public static void main(String[] args) {
         /*
         print number from 0 to 9
          */

        int number=0; //creating a variable of type int
        while(number<10){ //checks the condition if condition is true execute the code in the body of while loop
            System.out.println(number); //prints the value of number on console
            number++; //it adds one to the number variable
        }

        /*
        (initializing ; condition ; increment or decrement)
         */


       for(int i=0;i<10;i++){
           System.out.println(i);
        }

       //using a for loop print odd numbers from 1-20;
        for (int i=1; i<=20; i++){
            if (i%2==1) {
                System.out.println(i);
            }
        }
    }
}
