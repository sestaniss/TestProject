package class16;

public class Student {
    String name;
    String id;
   static String schoolName;
    int age;
    double weight;

    void printName(){
        System.out.println(name);
        System.out.println(schoolName);
    }
    static void printStudentInfo(){
        // System.out.println(name); << can't access: Non-static field 'name' cannot be referenced from a static context
        System.out.println(schoolName);
    }
}
