package homework.homework14;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp=new Employee("Sam","S222");
        emp.printInfo();
        emp.print();

        System.out.println();
        FullTime ft = new FullTime("Tami","N223","11/1/2022");
        ft.printInfo();
        ft.printStartDate();

        System.out.println();
        PartTime pt = new PartTime("Emy","T122","Fridays");
        pt.printInfo();
        pt.printSchedule();
    }
}
