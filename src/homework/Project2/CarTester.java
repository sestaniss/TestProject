package homework.Project2;

public class CarTester {
    public static void main(String[] args) {
        Sedan sedan= new Sedan();
        System.out.println("The price of this Sedan is "+sedan.calculateSalePrice(40000,12.5));

        Truck truck= new Truck();
        System.out.println("The price of this Truck is "+truck.calculateSalePrice(56000,3500));
    }
}
