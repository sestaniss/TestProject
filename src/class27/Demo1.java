package class27;

public class Demo1 {
    public static void main(String[] args) {
        String name="Zafar";
        String name2="Aiperi";
        String name3="Sarah";



        String[] names={"Tami", "Sam", "Nickou", "Lili"};
        //displayNames(names);
        printNames(name,name2,name3);
    }
    public static void displayNames(String [] names){
      // write code here to print all of the names from array console

        for (String name :names){
            System.out.println(name);
        }
    }

    public static void printNames(String name, String name2, String name3){
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
    }
}
