package homework7;

public class PhoneTester {
    public static void main(String[] args) {

        Phone phone1= new Phone();

        phone1.brand="Iphone";
        phone1.model="14 ProMax";
        phone1.color="Space Gray";
        phone1.memoryGB= 512;

        System.out.println(phone1.brand+" "+phone1.model);
        phone1.call();
        phone1.games();
        phone1.music();
        phone1.text();
        phone1.camera();

        Phone phone2= new Phone();

        phone2.brand="Pixel";
        phone2.model="7 Pro";
        phone2.color="Black";
        phone2.memoryGB= 128;
        System.out.println();
        System.out.println(phone2.brand+" "+phone2.model);
        phone2.call();
        phone2.games();
        phone2.music();
        phone2.text();
        phone2.camera();


        Phone phone3= new Phone();
        phone3.brand="Samsung";
        phone3.model="Galaxy S22";
        phone3.color="Pearl White";
        phone3.memoryGB= 256;
        System.out.println();
        System.out.println(phone3.brand+" "+phone3.model);
        phone3.call();
        phone3.games();
        phone3.music();
        phone3.text();
        phone3.camera();










    }
}
