public class Program{

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("1", 35000, "Иван Иванов");
        acc1.displayBalance();
        acc1.deposit(10000);
        acc1.displayBalance();
        // Попытка снять больше, чем есть на балансе
        acc1.withdraw(50000);
        acc1.displayBalance();



        /* class Person
        Person kate = new Person("Катя", 30, "Женский");
        kate.displayInfo();
        System.out.println(kate.getName());
        System.out.println(kate.getAge());
        System.out.println(kate.getGender());

        Person misha = new Person("Миша", 27, "Мужской");
        misha.displayInfo();
        System.out.println(misha.getName());
        System.out.println(misha.getAge());
        System.out.println(misha.getGender());
         */
    }
}
