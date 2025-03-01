class Human {

    private String name;
    private int age;
    private String gender;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.printf("Имя: %s, Возраст: %d | ", name, age);
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
}