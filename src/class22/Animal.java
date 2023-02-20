package class22;

public class Animal {

    String name;
    String color;
    int age;
    double weight;
    void speak(){
        System.out.println("Animals can speak");
    }
    void eat(){
        System.out.println("Alle the animals eat");
    }

}

class Cat extends Animal{
    //we are overriding speak method in cat class
    void speak(){
        System.out.println("Meow Meow........");
    }

}

class Dog extends Animal{

}

class Tester{

    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.speak();
    }
}
