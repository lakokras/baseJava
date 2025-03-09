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
            throw new IllegalArgumentException("Чего пустуем");
        }
        this.name = name.trim();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) throw new IllegalArgumentException("Чего это мы отрицательные");
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) throw new IllegalArgumentException("Чего это мы отрицательные");
        this.salary = salary;
    }
}


class Manager extends Employee{

    private String department;

    Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println("Работает " + getName() + " в " + department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

class Developer extends Employee {
    private String programmingLanguage;


    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println("Работает " + getName() + " использует " + getProgrammingLanguage());
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}