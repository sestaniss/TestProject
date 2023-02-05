package class19;

public class Student {
    String name;
    String address;

    Student (String name, String address){
        this.name=name;
        this.address=address;
    }

    void displayInfo () {
        System.out.println(name+" lives at "+address);
    }

    public static void main(String[] args) {
        Student s= new Student("Sam","222 Street");
        s.displayInfo();
    }
}
