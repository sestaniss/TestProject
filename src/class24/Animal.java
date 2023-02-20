package class24;

public abstract class Animal {
    /*
    define the speak eat methods and create 3 subclasses and override the speak eat methods
     */
    abstract void speak();
    void sleep(){
        System.out.println("Animals sleep 5 to 8 hours a day");
    }
}
class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("Woff Woff");
    }
}
class Cat extends Animal{
    void speak(){
        System.out.println("Meow Meow");
    }

}

