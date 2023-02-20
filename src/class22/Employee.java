package class22;

public class Employee {

    String name;

    static int baseSalary=30000;

    static int baseHoliday=10;

    void printSalary(){
        System.out.println(baseSalary);
    }
    void printHoliday(){
        System.out.println(baseHoliday);
    }
}

class OfficeBoy extends Employee{

}
class Manager extends Employee{
    void printSalary(){
        System.out.println((baseSalary*4)+200000);
    }
}

class Developer extends Employee{
    @Override
    void printSalary() {
        System.out.println((baseSalary*3)+200000);
    }
}

class QA extends Employee{
    void printSalary(){
        System.out.println((baseSalary*5)+300000);
    }
    void printHoliday(){
        System.out.println((baseHoliday*4)+5);
    }
}
