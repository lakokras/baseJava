import java.util.ArrayList;
import java.util.List;

class Wheel {
    void drive() {
        System.out.println("Колеса катяться");
    }
}

class Engine {
    void drive() {
        System.out.println("Двигатель работает");
    }
}

class Car {
    private Engine engine;
    private List<Wheel> wheels;

    // Композиция
    Car() {
        this.engine = new Engine();
        this.wheels = new ArrayList<>();
        this.wheels.add(new Wheel()); // Добавляем одно колесо
        this.wheels.add(new Wheel()); // Добавляем второе колесо
        this.wheels.add(new Wheel()); // Добавляем третье колесо
        this.wheels.add(new Wheel()); // Добавляем четвертое колесо
    }

    // Делегирование
    void drive() {
        this.engine.drive();
        for (Wheel wheel : this.wheels) {
            wheel.drive();
        }
    }
}