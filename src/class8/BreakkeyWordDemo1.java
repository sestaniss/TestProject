package class8;

public class BreakkeyWordDemo1 {
    public static void main(String[] args) {

        boolean summer=true;
        int temp=75;

        while(summer){
            if (temp<=100){
                System.out.println("I love summer because temperature is"+temp);
            }else {
                System.out.println("It`s very hot");
                break;
            }
            temp+=5;
        }


    }
}
