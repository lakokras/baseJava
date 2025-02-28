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
