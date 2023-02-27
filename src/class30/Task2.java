package class30;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a Set collection that will hold Objects of Student Type.
        In this se we do not care about the insertion order.
        Each student object should have name and studentID. Display name of each student.
         */

       // HashSet<Student> students=new HashSet<>();

        Set<Student> students=new HashSet<>(); // we can achieve polymorphism
        students.add(new Student("Sam", 444));
        students.add(new Student("Tami", 442));
        students.add(new Student("Abeera", 443));
        students.add(new Student("Savo", 445));

        //Display the name of each student
        for (Student student : students){
            System.out.println(student.getName());
        }
    }
}
class Student{
    private String name;

    private int studentID;
    public Student(String name, int studentID){
        this.name = name;
        this.studentID = studentID;
    }
    public String getName(){
        return name;
    }
}
