package homework.homework7;

public class DogTester {
    public static void main(String[] args) {

        Dog dog1= new Dog();
        dog1.name="Optimus";
        dog1.breed="Husky";
        dog1.color="DeepBlack";
        dog1.weight=25;
        System.out.println(dog1.name+" is a "+dog1.breed);
        dog1.bark();
        dog1.eat();
        dog1.wiggleTail();
        dog1.sleep();

        System.out.println();
        Dog dog2= new Dog();
        dog2.name="Maximus";
        dog2.breed="BullDog";
        dog2.color="Black & White";
        dog2.weight=15;
        System.out.println(dog2.name+" is a "+dog2.breed);
        dog2.bark();
        dog2.eat();
        dog2.wiggleTail();
        dog2.sleep();

        System.out.println();
        Dog dog3= new Dog();
        dog3.name="Leonidas";
        dog3.breed="Labrador";
        dog3.color="White";
        dog3.weight=38;
        System.out.println(dog3.name+" is a "+dog3.breed);
        dog3.bark();
        dog3.eat();
        dog3.wiggleTail();
        dog3.sleep();

    }
}
