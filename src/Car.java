public class Car {

    private final String model;
    private final String year;
    private double speed;

    public Car(String model, String year, double speed) {
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public void displayCarInfo() {
        System.out.printf("Ваш втомобиль — %s, %s года \n", model, year);
    }

    public void accelerate(int increment) {
        if (increment < 0) {
            throw new IllegalArgumentException("хз, как ты собрался прибавлять отрицательной скоростью газку");
        }
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
