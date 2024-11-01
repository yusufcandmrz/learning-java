import java.io.*;

/* class Student implements Serializable {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
} */

class Person implements Serializable {
    // private static final long serialversionUID = 1L;
    transient int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Student extends Person {
    String course;
    int fee;

    public Student(int id, String name, String course, int fee) {
        super(id, name);
        this.course = course;
        this.fee = fee;
    }
}

public class Main {
    public static void main(String[] args) {
        String testFileAddress = "D:\\java\\learning-java\\JavaSerialization\\TestFile.txt";

        //Java Serialization
        /* Student student = new Student(1224, "Yusuf");
        try (
                FileOutputStream fout = new FileOutputStream(testFileAddress);
                ObjectOutputStream oout = new ObjectOutputStream(fout);
        ) {
            oout.writeObject(student);
            oout.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } */

        /* try (
                ObjectInputStream oin = new ObjectInputStream(new FileInputStream(testFileAddress));
        ) {
            Student student = (Student) oin.readObject();
            System.out.println(student.id + " - " + student.name);
        } catch (Exception e) {
            e.printStackTrace();
        } */

        /* Student student = new Student(1224, "Yusuf", "Engineering", 50000);
        try (
                FileOutputStream fout = new FileOutputStream(testFileAddress);
                ObjectOutputStream oout = new ObjectOutputStream(fout);
        ) {
            oout.writeObject(student);
            oout.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (
                FileInputStream fin = new FileInputStream(testFileAddress);
                ObjectInputStream oin = new ObjectInputStream(fin);
        ) {
            Student studentTwo = (Student) oin.readObject();
            System.out.println(studentTwo.id + " - " + studentTwo.name + " - " + studentTwo.course + " - " + studentTwo.fee);
        } catch (Exception e) {
            e.printStackTrace();
        } */
    }
}