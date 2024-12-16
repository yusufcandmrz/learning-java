package copy.com.yusufcandmrz.jdk10.localvariabletypeinference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static int returnZero() {
        return 0;
    }

    public static void main(String[] args) {

        // https://www.baeldung.com/java-10-local-variable-type-inference

        // Defining a variable without using var
        String message = "Hello String";

        // Defining a variable with using var
        var messageTwo = "Hello var";

        // Using var with Map
        Map<Integer, String> map = new HashMap<>();
        var mapTwo = new HashMap<Integer, String>();

        // Won't work without initializer
        // var n;

        // Won't work if initialized with null
        // var nTwo = null;

        // Won't work for non-local variable
        // public n nThree = "hello";

        // Needs explicit target type in array
        // var nFour = {1, 2, 3};

        // Legal use of var but difficult to understand
        var nFive = returnZero();

        // Using with diamond operator
        var nSix = new ArrayList<>();
        var nSeven = new ArrayList<String>();

        // *******************************************************************
        // *******************************************************************
        // *******************************************************************

        // Using with collections
        var names = List.of("Alice", "Bob", "Charlie");
        System.out.println("Names: " + names);

        // Using with streams
        var filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();
        System.out.println("Filtered Names: " + filteredNames);

        // Using in loops
        for (var name : names) {
            System.out.println("Name: " + name);
        }

        // Using with Map.Entry
        var mapThree = Map.of("key1", "value1", "key2", "value2");
        for (var entry : mapThree.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
