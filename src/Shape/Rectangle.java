package Shape;

import static java.lang.Math.pow;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        double result = 0;
        result = width * height;
        return result;
    }
    @Override
    public double getPerimeter() {
        double result = 0;
        result = 2 * (width * height);
        return result;
    }
}
