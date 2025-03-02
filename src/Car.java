public class Car {

    private final String model;
    private final String year;
    private double speed;
    private String owner;

    public Car(String model, String year, double speed, String owner) {
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.owner = owner;
    }

    public void displayCarInfo() {
        System.out.printf("Автомобиль — %s, %s года, Текущая скорость: %.2f \n", model, year, speed);
    }

    public void accelerate(int increment) {
        this.speed += increment;
        System.out.printf("Текущая скорость: %.2f \n", speed);
    }

    public void brake(int decrement) {
        if (decrement > speed) {
            throw new IllegalArgumentException("Скорость равна 0");
        }
        this.speed -= decrement;
        System.out.printf("Текущая скорость: %.2f \n", speed);
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed < 0) {
            throw new IllegalArgumentException("Скорость не может быть отрицательной");
        } this.speed = speed;
        System.out.printf("Скорость автомобиля = %.2f", speed);
    }
}
