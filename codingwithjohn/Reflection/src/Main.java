import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        // Cat cat = new Cat("Golge", 1);
        /* Field[] catFields = cat.getClass().getDeclaredFields();
        for (Field catField : catFields) {
            if (catField.getName().equals("name")) {
                catField.setAccessible(true);
                try {
                    catField.set(cat, "Shadow");
                } catch (IllegalAccessException e) {
                    System.out.println("IllegalAccessException: " + e.getMessage());
                }
            }
        }
        System.out.println(cat.getName()); */

        /* Method[] catMethods = cat.getClass().getDeclaredMethods();
        for (Method catMethod : catMethods) {
            if (catMethod.getName().equals("thisIsPrivateMethod")) {
                catMethod.setAccessible(true);
                try {
                    catMethod.invoke(null);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        } */
    }
}