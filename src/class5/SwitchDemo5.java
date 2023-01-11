package class5;

import java.util.Scanner;

public class SwitchDemo5 {
    public static void main(String[] args) {

     Scanner scanner=new Scanner(System.in);
     char gender=scanner.next().charAt(0);

     switch (gender){

         case'f':
             System.out.println("Female");
             break;
         case'F':
             System.out.println("Female");
             break;
         case'm':
         case'M':
             System.out.println("Male");
             break;
         default:
             System.out.println("not specified");
              }


        }
    }

