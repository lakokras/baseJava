public class Program{

    public static void main(String[] args) {
        Human person1 = new Human("Джейн", 21);
        BankAccount account1 = new BankAccount("1", 50000, person1.getName());
        Car car1 = new Car("BMW", "2010", 0, person1.getName());

        person1.displayInfo();
        account1.displayAccountInfo();
        car1.displayCarInfo();

    }
}
