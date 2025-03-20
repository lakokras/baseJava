public class Program{

    public static void main(String[] args) {
        Employee manager = new Manager("Апероль", 12, 120000, "IT");
        Employee developer = new Developer("Айзат", 11, 70000, "PHP");

        manager.work();
        manager.displayEmployeeInfo();

        developer.work();
        developer.displayEmployeeInfo();
    }
}