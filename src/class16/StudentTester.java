package class16;

public class StudentTester {
    public static void main(String[] args) {

        Student student=new Student();
        student.name="Sam";
        student.id="123";
        student.age=34;
        student.weight=230;
        student.schoolName="Syntax";

        Student student1=new Student();
        student1.name="Tami";
        student1.id="122";
        student1.age=28;
        student1.weight=150;
       // student1.schoolName="Syntax";


        Student student2=new Student();
        student2.name="Maged";
        student2.id="124";
        student2.age=42;
        student2.weight=202;
       // student2.schoolName="Syntax";

        System.out.println(student2.schoolName);
        System.out.println(Student.schoolName);// another way that you might see a lot to access static variables
        System.out.println();
    }
}
