package homework.homework12;

public class StudentsTester {
    public static void main(String[] args) {
        Students student1 = new Students ("Sam",92,85,97);
        Students student2 = new Students ("Tami",88,68,91);
        Students student3 = new Students ("Maged",80,72,60);
        Students student4 = new Students ("Emy",50,45,55);
        Students student5 = new Students ("Rana",42,38,45);

        student1.averageMark();
        student2.averageMark();
        student3.averageMark();
        student4.averageMark();
        student5.averageMark();
    }
}
