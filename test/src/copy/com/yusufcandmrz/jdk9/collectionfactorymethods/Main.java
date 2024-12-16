package copy.com.yusufcandmrz.jdk9.collectionfactorymethods;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // https://www.baeldung.com/java-9-collections-factory-methods

        // Creating immutable collection with traditional way
        Set<String> set = new HashSet<>();
        set.add("foo");
        set.add("bar");
        set.add("baz");
        set = Collections.unmodifiableSet(set);

        // Creating immutable "List" collection with factory method
        List<String> list = Arrays.asList("foo", "bar", "baz");

        // Creating immutable collection with double-brace initialization
        Set<String> setTwo = Collections.unmodifiableSet(new HashSet<String>() {{
            add("foo");
            add("bar");
            add("baz");
        }});

        // Creating immutable collection with factory methods
        List<String> listTwo = List.of("foo", "bar", "baz");
        Set<String> setThree = Set.of("foo", "bar", "baz");

        // Getting IllegalArgumentException with Set
        // Set<String> setFour = Set.of("foo", "bar", "baz", "foo");

        // Creating immutable collection with primitive type
        int[] arr = {1, 2, 3, 4, 5};
        List<int[]> listThree = List.of(arr);

        // Creating immutable "Map" collection with factory method
        Map<String, String> map = Map.of("foo", "a", "bar", "b", "baz", "c");

        // Using ofEntries method in Map interface
        Map<String, String> mapTwo = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("foo", "a"),
                new AbstractMap.SimpleEntry<>("bar", "b"),
                new AbstractMap.SimpleEntry<>("baz", "c")
        );

        // Getting IllegalArgumentException with Map
        // Map<String, String> mapThree = Map.of("foo", "a", "foo", "b");

        // Immutable - Getting UnsupportedOperationException
        List<String> listFour = List.of("foo", "bar");
        // listFour.add("baz");
        // listFour.set(0, "baz");
        // listFour.remove(0);

        // No null Element Allowed - Getting NullPointerException
        // List<String> listFive = List.of("foo", "bar", null);

        // Value-Based Instances
        List<String> listSix = List.of("foo", "bar");
        List<String> listSeven = List.of("foo", "bar");
        System.out.println(listSix == listSeven);
    }
}
