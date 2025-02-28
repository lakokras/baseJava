public class Program{

    public static void main(String[] args) {

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
    }
}
class Person {

    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void displayInfo() {
        setGender(gender);
        setName(name);
        setAge(age);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Неверный возраст");
        } this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}