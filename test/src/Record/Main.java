package Record;

public class Main {
    public static void main(String[] args) {
        StudentClass studentClass = new StudentClass("firstStudent", 20);
        StudentRecord studentRecord = new StudentRecord("secondStudent", 20);
        System.out.println(studentClass);
        System.out.println(studentRecord);
        StudentRecord.accessStringVariable();
    }
}