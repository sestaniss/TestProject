package Class2;

public class VariablesDemo2 {
    public static void main(String[] args) {
        int numberbox=10; // we don`t need to define data-types again and again Java remembers it
        numberbox=20; // we are reassigning number 20 to numberBox so it will overwrite 10 with 20
        System.out.println(numberbox);
        numberbox=200;
        System.out.println(numberbox);
        numberbox=30;
        System.out.println(numberbox+20);

        int number=20;
        int number2=20;
        int number3=20;
        int number4=20;
        System.out.println(number*1);
        System.out.println(number*2);
        System.out.println(number*3);
        System.out.println(number*4);

        System.out.println("*************");
        System.out.println(number*1);
        System.out.println(number2*2);
        System.out.println(number3*3);
        System.out.println(number4*4);

    }
}
