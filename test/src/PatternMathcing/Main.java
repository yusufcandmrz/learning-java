package PatternMathcing;

public class Main {

    public static <T> void printString(T variable) {
        /* if (variable instanceof String) {
            String string = (String) variable;
            System.out.println(string);
        } */
        if (variable instanceof String string && string.length() > 5) {
            System.out.println("length of " + string + " is larger than five.");
        }
    }

    public static String returnVariableType(Object variable) {
        return switch (variable) {
            case Integer i -> "Integer: " + i;
            case Double d -> "Double: " + d;
            case String s -> "String: " + s;
            default ->
                "Unknown type";
        };
    }

    public static void main(String[] args) {
        printString("string variable");
        System.out.println(returnVariableType("variable"));
    }
}
