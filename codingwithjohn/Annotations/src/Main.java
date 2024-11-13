import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    @SuppressWarnings(value = "unused")
    public static void main(String[] args) {
        // Cat cat = new Cat("Golge", 1);

        /* if (cat.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("This class is very important");
        } else {
            System.out.println("This class is not very important");
        }

        Method[] methods = cat.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for (int times = 0; times < annotation.times(); times++) {
                    try {
                        method.invoke(cat);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

        Field[] fields = cat.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(ImportantField.class)) {
                try {
                    Object object = field.get(cat);
                    if (object instanceof String string) {
                        System.out.println(string.toUpperCase());
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        } */
    }
}