import java.util.Optional;

public class Main {

    public static String returnString(boolean shouldReturn) {
        return shouldReturn ? "string" : null;
    }

    public static Optional<String> returnStringTwo(boolean shouldReturn) {
        return shouldReturn ? Optional.of("string") : Optional.empty();
    }

    public static void main(String[] args) {
        /* String string = returnString(true);
        System.out.println("string length: " + string.length()); */

        /* String string = returnString(false);
        int stringLength;
        if (string != null) {
            stringLength = string.length();
        } else {
            stringLength = 0;
        }
        System.out.println("string length: " + stringLength); */

        /* Optional<String> string = returnStringTwo(true);
        System.out.println(string.get()); */

        /* Optional<String> string = returnStringTwo(false);
        int stringLength;
        if(string.isPresent()) {
            stringLength = string.get().length();
        } else {
            stringLength = 0;wa
        }
        System.out.println("string length: " + stringLength); */

        // System.out.println(returnStringTwo(true).orElseThrow(() -> new RuntimeException("No returned String value")));

        // System.out.println(returnStringTwo(false).orElseThrow(() -> new RuntimeException("No returned String value")));

        /* String resultString = returnStringTwo(false).orElse("empty string");
        System.out.println(resultString); */

        // System.out.println(returnStringTwo(false).map(String::length).orElse(0));
    }
}