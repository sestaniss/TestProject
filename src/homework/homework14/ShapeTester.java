package homework.homework14;

public class ShapeTester {
    public static void main(String[] args) {

        Shape shape = new Shape(9.5);
        shape.printRadius();

        Circle circle=new Circle(shape.radius);
        circle.printRadius();
        System.out.println("The area of the circle is "+circle.getArea());

    }
}
