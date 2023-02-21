package homework.homework18;

import java.util.ArrayList;
import java.util.Iterator;

public class Task6 {
    public static void main(String[] args) {

Insurance car=new Car("Progressive","Hyundai");
        Insurance pet=new Pet("PetLife","dog");
        Insurance health=new Health("Cigna");

        ArrayList<Insurance> insurance=new ArrayList<>();
        insurance.add(car);
        insurance.add(pet);
        insurance.add(health);

        for (int i = 0; i < insurance.size(); i++) {
            Insurance ins=insurance.get(i);
            ins.getQuote();
            ins.cancelInsurance();
            System.out.println();
        }
        System.out.println("**********************************************************");

        for (Insurance ins:insurance){
            ins.getQuote();
            ins.cancelInsurance();
            System.out.println();
        }
        System.out.println("***********************************************************");

        Iterator<Insurance>iterator=insurance.iterator();
        while (iterator.hasNext()){
            Insurance i=iterator.next();
            i.getQuote();
            i.cancelInsurance();
            System.out.println();
        }

    }
}
abstract class Insurance{
    String insuranceName;
    abstract void getQuote();
    abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel;
    Car(String insuranceName, String carModel){
        super.insuranceName=insuranceName;
        this.carModel=carModel;
    }

    @Override
    void getQuote() {
        System.out.println("The insurance coverage will cost $425 for your "+this.carModel+" with "+super.insuranceName);
    }

    @Override
    void cancelInsurance() {
        System.out.println("There is no penalty to cancel coverage with "+super.insuranceName);
    }
}
class Pet extends Insurance{
    String petType;
    Pet(String insuranceName, String petType){
        super.insuranceName=insuranceName;
        this.petType=petType;
    }
    @Override
    void getQuote() {
        System.out.println("The insurance coverage will cost $140 for your "+this.petType+" with "+super.insuranceName);
    }

    @Override
    void cancelInsurance() {
        System.out.println("There is a $45 charge to cancel coverage with "+super.insuranceName);
    }
}
class Health extends Insurance{
    Health(String insuranceName){
        super.insuranceName=insuranceName;
    }
    @Override
    void getQuote() {
        System.out.println("The insurance coverage will cost $1250 with "+super.insuranceName);
    }

    @Override
    void cancelInsurance() {
        System.out.println("There is a waiting period that has to be met before you can cancel coverage with "+super.insuranceName);
    }
}

