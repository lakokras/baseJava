public class Program{

    public static void main(String[] args) {

        BankClient client1 = new BankClient("Михаил", 30);
        BankAccount account1 = new BankAccount("1", 50000);

        client1.displayInfo();
        account1.displayAccountInfo();
        // методы класса BankAccount
        account1.deposit(10000);
        account1.withdraw(15000);


        Human person1 = new Human("Даниил", 27);
        Car car1 = new Car("BMW", "2010", 0);

        person1.displayInfo();
        car1.displayCarInfo();
        // методы класса Car
        car1.accelerate(70);
        car1.brake(20);
    }
}
