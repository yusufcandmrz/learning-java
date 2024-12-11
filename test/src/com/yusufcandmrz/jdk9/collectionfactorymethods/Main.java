package com.yusufcandmrz.jdk9.collectionfactorymethods;

public class Main {

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
}
