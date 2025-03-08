package Shape;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double result = 0;
        result = pow(radius, 2) * PI;
        return result;
    }

    @Override
    public double getPerimeter() {
        double result = 0;
        result = radius * pow(PI, 2);
        return result;
    }
}
