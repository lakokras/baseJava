public class Program{

    public static void main(String[] args) {


        Payable[] payableMethods = new Payable[3];
        payableMethods[0] = new CreditCard("1234-5678-9123-4567");
        payableMethods[1] = new PayPal("example@gmail.com");
        payableMethods[2] = new BankTransfer("109249071");

        for (Payable payable : payableMethods) {
            payable.pay(100);
        }





//        Employee manager = new Manager("Апероль", 12, 120000, "IT");
//        Employee developer = new Developer("Айзат", 11, 70000, "PHP");
//
//        manager.work();
//        manager.displayEmployeeInfo();
//
//        developer.work();
//        developer.displayEmployeeInfo();


//
//
//        CarOwner owner = new CarOwner("Даниил", 27);
//        Car car1 = new Car("BMW", "2010", 0);
//
//        owner.displayInfo();
//        car1.displayCarInfo();
//        // методы класса Car
//        car1.accelerate(70);
//        car1.brake(20);
    }
}