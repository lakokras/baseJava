package Shape;

public class Program {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(15);
        shapes[1] = new Rectangle(12, 10);
        shapes[2] = new Triangle(5, 7, 12);

        for (Shape shape : shapes) {
            System.out.println("Площадь = " + shape.getArea());
            System.out.println("Периметр = " + shape.getPerimeter());
        }
    }
}
