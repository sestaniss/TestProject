package homework.homework13;

public class School {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        teacher1.name="Sam";
        teacher1.teacherId=224484;
        teacher1.subject="Communications";
        teacher1.age=28;
        teacher1.printName();
        teacher1.printID();
        teacher1.printSubject();
        teacher1.printAge();

        System.out.println("------------------------------");
        MathTeacher teacher2 = new MathTeacher();
        teacher2.name="Tami";
        teacher2.teacherId=123456;
        teacher2.salary=45000;
        teacher2.subject="Mathematics";
        teacher2.age=45;
        teacher2.printName();
        teacher2.printID();
        teacher2.printSubject();
        teacher2.printAge();
        teacher2.printSalary();

        System.out.println("------------------------------");
        ChemistryTeacher teacher3 = new ChemistryTeacher();
        teacher3.name="Sumair";
        teacher3.teacherId=454562;
        teacher3.schedule="Thursday";
        teacher3.subject="Chemistry";
        teacher3.age=39;
        teacher3.printName();
        teacher3.printID();
        teacher3.printSubject();
        teacher3.printAge();
        teacher3.printSchedule();

        System.out.println("------------------------------");
        PianoTeacher teacher4 = new PianoTeacher();
        teacher4.name="Amira";
        teacher4.teacherId=200812;
        teacher4.hobby="listening to classic music";
        teacher4.subject="Piano";
        teacher4.age=24;
        teacher4.printName();
        teacher4.printID();
        teacher4.printAge();
        teacher4.printSubject();
        teacher4.favoriteHobby();

    }

}
