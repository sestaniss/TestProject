package class16;

public class SyntaxEmployee {
    /*
    Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
     */
    String empID;
    int salary;
    static String CEO;

    public static void main(String[] args) {
        SyntaxEmployee employee = new SyntaxEmployee();
        employee.empID="001";
        employee.salary=500000;
        employee.CEO="Sumair";
        System.out.println("Employee ID is "+employee.empID+" and employee's salary is "+employee.salary+" and the CEO is "+employee.CEO);

        SyntaxEmployee employee1 = new SyntaxEmployee();
        employee1.empID="002";
        employee1.salary=450000;
        System.out.println("Employee ID is "+employee1.empID+" and employee's salary is "+employee1.salary+" and the CEO is "+SyntaxEmployee.CEO);

    }
}
