package class21;

public class Animal {
    String name;
    String color="Black";

}

class Cat extends Animal {
    int age=10;
    double weight;
    String color="White";
    void printColor(){
        String color="Blue";
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
    }
}


