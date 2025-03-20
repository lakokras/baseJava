public abstract class Employee {
    private String name;
    private int id;
    private double salary;


    protected Employee(String name, int id, double salary) {
        setName(name);
        setId(id);
        setSalary(salary);
    }

    public abstract void work();

    void displayEmployeeInfo() {
        System.out.printf("Имя: %s, ID: %d, Зарплата: %.2f \n", name, id, salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (null == name || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.name = name.trim();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) throw new IllegalArgumentException("Поле ID не должно быть отрицательным");
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) throw new IllegalArgumentException("Зарплата не может быть отрицательной");
        this.salary = salary;
    }
}