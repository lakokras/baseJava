package Animals;

public class Program {
    public static void main(String[] args) {

        Animal[] animal = new Animal[] {
                new Dog("Барси"),
                new Cat("Мурзик"),
                new Bird("Петя")
        };

        for (Animal animal1 : animal) {
            animal1.makeSound();
        }
        
    }
}
