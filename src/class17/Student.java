package class17;

public class Student {
    /*
    Create a class call it Student define 4 instance fields like name, age, weight, id
    create 5 objects of this class. Do this task without constructions and with constructor
     */

    String name;
    int age;
    double weight;
    String id;

    Student(String studentName, int studentAge, double studentWeight, String studentID){
        name=studentName;
        age=studentAge;
        weight=studentWeight;
        id=studentID;
    }

    void printInfo (){
        System.out.println("Student name is "+name+", the age is "+age+", the weight is "+weight+", the student ID is "+id);
    }

    public static void main(String[] args) {
        Student student1 = new Student ("Sam",24,70.5,"s998");
        Student student2 = new Student ("Tami",22,55.1,"s555");
        Student student3 = new Student ("Peter",28,50.2,"s789");
        Student student4 = new Student ("Nelson",95,45.3,"s988");
        Student student5 = new Student ("Diana",26,60.4,"s655");

        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
        student4.printInfo();
        student5.printInfo();
    }

}
