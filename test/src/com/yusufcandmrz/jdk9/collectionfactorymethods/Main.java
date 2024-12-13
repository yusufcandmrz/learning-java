package com.yusufcandmrz.jdk9.collectionfactorymethods;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*
        What was used before it?
        Before Collection Factory Methods, creating small collections was more verbose

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");

        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key3", 3);

        These approaches required multiple lines of code, more effort, and introduced risks of accidental modifications.

        List<String> list = List.of("one", "two", "three");
        Set<String> set = Set.of("one", "two", "three");
        Map<String, Integer> map = Map.of("key1", 1, "key2", 2, "key3", 3);

        Limitations
        Fixed Size:
        These collections are immutable. Adding or removing elements will throw UnsupportedOperationException.
        Duplicate Elements (for Sets):
        Passing duplicate elements to Set.of(...) will throw an IllegalArgumentException.
        Null Values:
        Null values are not allowed, which was permissible in traditional collections.
        */

        // **********************************
        // **********************************

        // immutable Collection neden olusturmaliyim?
        // .of metotu ile olusturdugumuz collection'lar immutable olarak olusur.
        // https://www.baeldung.com/java-9-collections-factory-methods

        Set<String> set = new HashSet<>();
        set.add("foo");
        set.add("bar");
        set.add("baz");
        set = Collections.unmodifiableSet(set);

        List<String> list = Arrays.asList("foo", "bar", "baz");

        Set<String> setTwo = Collections.unmodifiableSet(new HashSet<String>() {{
            add("foo");
            add("bar");
            add("baz");
        }});

        int[] arr = {1, 2, 3, 4, 5};
        List<int[]> listTwo = List.of(arr);
        // System.out.println(listTwo.size());

        Map<String, String> map = Map.of("foo", "a", "bar", "b", "baz", "c");
        // System.out.println(map);

        /* Collections created using factory methods are immutable, and changing an element, adding new elements, or
        removing an element throws UnsupportedOperationException */
        Set<String> setThree = Set.of("foo", "bar");
        // setThree.add("baz");

        /* In the case of List and Set, no elements can be null. In the case of a Map, neither keys nor values can be
        null. Passing null argument throws a NullPointerException */
        // List.of("foo", "bar", null);
        // As opposed to List.of, the Arrays.asList method accepts null values

        /* The instances created by factory methods are value-based. This means that factories are free to create a new
        instance or return an existing instance. Hence, if we create Lists with same values, they may or may not refer
        to the same object on the heap */
        List<String> listThree = List.of("foo", "bar");
        List<String> listFour = List.of("foo", "bar");
        System.out.println(listThree == listFour);
        // In this case, list1 == list2 may or may not evaluate to true depending on the JVM.
    }
}
