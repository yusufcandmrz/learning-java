package com.yusufcandmrz.collectionfactorymethods;

import java.util.*;

import static java.util.Map.entry;

public class Main {

    public static void main(String[] args) {

        // https://docs.oracle.com/en/java/javase/13/core/creating-immutable-lists-sets-and-maps.html

//        // Unmodifiable List Static Factory Methods
//        List<String> stringList = Arrays.asList("a", "b", "c");
//        stringList = Collections.unmodifiableList(stringList);
//        List<String> newStringList = List.of("a", "b", "c");

//        // Unmodifiable Set Static Factory Methods
//        Set<String> stringSet = new HashSet<>(Arrays.asList("a", "b", "c"));
//        stringSet = Collections.unmodifiableSet(stringSet);
//        Set<String> newStringSet = Set.of("a", "b", "c");

//        // Unmodifiable Map Static Factory Methods
//        Map<Integer, String> stringMap = new HashMap<>();
//        stringMap.put(1, "a");
//        stringMap.put(2, "b");
//        stringMap.put(3, "c");
//        stringMap = Collections.unmodifiableMap(stringMap);
//        Map<Integer, String> newStringMap = Map.of(1, "a", 2, "b", 3, "c");

//        Map<Integer, String> newLargeStringMap = Map.ofEntries(
//                entry(1, "Tom"),
//                entry(2, "Rick"),
//                entry(3, "Harry"),
//                entry(99, "Mathilde"));

//        // Creating Unmodifiable Copies of Collections
//        List<String> newStringListCopy = List.copyOf(newStringList);
//        Set<String> newStringSetCopy = Set.copyOf(newStringSet);
//        Map<Integer, String> newStringMapCopy = Map.copyOf(newStringMap);

        // *************************************************************************************************************
        // *************************************************************************************************************
        // *************************************************************************************************************

        // https://www.baeldung.com/java-9-collections-factory-methods

//        // Creating immutable collection with traditional way
//        Set<String> set = new HashSet<>();
//        set.add("foo");
//        set.add("bar");
//        set.add("baz");
//        set.add("foo");
//        set = Collections.unmodifiableSet(set);

//        // Creating immutable "List" collection with traditional method
//        List<String> list = Arrays.asList("foo", "bar", "baz");
//        list = Collections.unmodifiableList(list);

//        // Creating immutable collection with double-brace initialization
//        Set<String> setTwo = Collections.unmodifiableSet(new HashSet<String>() {{
//            add("foo");
//            add("bar");
//            add("baz");
//        }});

//        // Creating immutable collection with factory methods
//        List<String> listTwo = List.of("foo", "bar", "baz");
//        Set<String> setThree = Set.of("foo", "bar", "baz");

//        // Getting IllegalArgumentException with Set
//        // Set<String> setFour = Set.of("foo", "bar", "baz", "foo");

//        // Creating immutable "Map" collection with factory method
//        Map<String, String> map = Map.of("foo", "a", "bar", "b", "baz", "c");

//        // Using ofEntries method in Map interface
//        Map<String, String> mapTwo = Map.ofEntries(
//                new AbstractMap.SimpleEntry<>("foo", "a"),
//                new AbstractMap.SimpleEntry<>("bar", "b"),
//                new AbstractMap.SimpleEntry<>("baz", "c")
//        );

//        // Getting UnsupportedOperationException
//        List<String> listFour = List.of("foo", "bar");
//        // listFour.add("baz");
//        // listFour.set(0, "baz");
//        // listFour.remove(0);

//        // Getting NullPointerException
//        // List<String> listFive = List.of("foo", "bar", null);
    }
}
