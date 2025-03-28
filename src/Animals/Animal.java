package Animals;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        setName(name);
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Поле имя не может быть пустым");
        }
        this.name = name.trim();
    }
}
