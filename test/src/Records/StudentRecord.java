package Records;

public record StudentRecord(String name, int age) {

    private static final String stringVariable = "stringVariable";

    public StudentRecord {
        System.out.println("Record.StudentRecord object created");
    }

    public static void accessStringVariable() {
        System.out.println(stringVariable);
    }
}
