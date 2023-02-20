package class23;

public class Student {

    public void study(){
        System.out.println("studying..... ");
    }

    void doHomeWork(){
        System.out.println("Solving homework");
    }
    void practice(){
        System.out.println("practicing the skills");
    }
}
class SyntaxStudent extends Student {
    @Override
    public void study() {
        System.out.println("Syntax Student must study Programming");
    }

    @Override
    void doHomeWork() {
        System.out.println("Syntax Student must solve the homeworks before the next class");
    }

    @Override
    void practice() {
        System.out.println("Syntax Student must practice repls");
    }
}
    class CollegeStudent extends Student{
        @Override
        void practice() {
            System.out.println("College Student must practice to get good grades");
        }
    }

    class SchoolStudent extends Student{

    }
