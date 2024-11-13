public class Cat {

    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void thisIsPublicAndStaticMethod() {
        System.out.println("public and static method");
    }

    public void thisIsPublicMethod() {
        System.out.println("public method");
    }

    private static void thisIsPrivateAndStaticMethod() {
        System.out.println("private and static method");
    }

    private void thisIsPrivateMethod() {
        System.out.println("private method");
    }
}
