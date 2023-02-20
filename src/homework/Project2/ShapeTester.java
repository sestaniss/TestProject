package homework.Project2;

public class ShapeTester {
    public static void main(String[] args) {
        Circle circle=new Circle(7.5);
        circle.calculateArea();
        circle.calculatePerimeter();

        Square square=new Square(5);
        square.calculateArea();
        square.calculatePerimeter();
    }
}
