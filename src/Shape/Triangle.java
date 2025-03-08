package Shape;

public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double result = 0;
        result = (sideA + sideB + sideC) / 2;
        return result;
    }
    @Override
    public double getPerimeter() {
        double result = 0;
        result = sideA + sideB + sideC;
        return result;
    }
}
