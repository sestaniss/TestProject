package homework.homework12;

public class Tas3StaffTester {
    public static void main(String[] args) {


        //Task3Staff staff1 = new Task3Staff("Shazam", 25, 225000, "123456789"); << error because the constructor is private
        Task3Staff staff2 = new Task3Staff("Tami", 28, 200000);
        Task3Staff staff3 = new Task3Staff("Black Adam", 33);
        Task3Staff staff4 = new Task3Staff("Hercules");
        //staff1.printInfo();
        staff2.printInfo();
        staff3.printInfo();
        staff4.printInfo();

    }
}
