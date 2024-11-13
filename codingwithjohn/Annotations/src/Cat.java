@VeryImportant
public class Cat {

    @ImportantField
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @RunImmediately(times = 3)
    public void meow() {
        System.out.println("meow!");
    }
}
