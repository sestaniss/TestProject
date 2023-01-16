package class9;

public class ArraysDemo {
    public static void main(String[] args) {
        String name="Sam";
        String name2="Tami";
        String name3="Maged";
        String name4="Kanti";
        String name5="Kamilla";

        String [] names={"Sam","Tami","Maged","Kanti","Kamilla","Amira"};

        System.out.println(name2);
        System.out.println(names[4]);
        System.out.println(names[3]);
        System.out.println(names[5]);
        //System.out.println(names[500]); error because there is no name on index number 500
        //System.out.println(names[-5]); error because index can`t be negative

        for (int i = 0; i <=6 ; i++) {
            System.out.println(names[i]);

        }




}
}
