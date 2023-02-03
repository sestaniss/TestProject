package homework.homework12;

public class Task3Staff {
    /* Task3:
    Write a java class that have 4 constructors with 4 different access levels of constructors
    (private,public,default,protected)
    and create 4 objects of this class:
    1 - inside same class;
    2 - from outside the class;
    3 - from different class inside different package  and observe result.  (check Practice folder for EmployeesTester2)
     */

    String name;
    int age;
    int salary;
    String ssn;

    private Task3Staff (String sName, int sAge, int sSalary, String sSSN){
        name=sName;
        age=sAge;
        salary=sSalary;
        ssn=sSSN;
    }

    protected Task3Staff (String sName, int sAge, int sSalary){
        name=sName;
        age=sAge;
        salary=sSalary;
    }

    public Task3Staff (String sName, int sAge){
        name=sName;
        age=sAge;
    }

    Task3Staff (String sName){
        name=sName;
    }

    public void printInfo () {
        System.out.println(name + " is " + age + " years old and earns " + salary + ", and the SSN is " + ssn);
    }

    public static void main(String[] args) {
        Task3Staff staff1 = new Task3Staff("Shazam", 25, 225000, "123456789");
        Task3Staff staff2 = new Task3Staff("Tami", 28, 200000);
        Task3Staff staff3 = new Task3Staff("Black Adam", 33);
        Task3Staff staff4 = new Task3Staff("Hercules");
        staff1.printInfo();
        staff2.printInfo();
        staff3.printInfo();
        staff4.printInfo();
    }

}
