package com.yusufcandmrz.patternernmatching;

enum Color {
    RED, GREEN, BLUE;
};

public class Main {

    public static void main(String[] args) {
        // Circle
        Circle circle = new Circle(12.3);
        // System.out.println(Shape.getPerimeter(circle));

        // Rectangle
        Rectangle rectangle = new Rectangle(1, 2);
        // System.out.println(Shape.bigEnoughRect(rectangle));

        // Selector Expression Type
        typeTester("hello typeTester");
        typeTester(Color.RED);
    }

    static void typeTester(Object object) {
        String result = switch (object) {
            case null -> "null";
            case String s -> "String";
            case Color c -> "Color with " + c.values().length + " values";
            case int[] a -> "Array of int values of length " + a.length;
            default -> "Something else";
        };
        System.out.println(result);
    }

//    // Pattern Label Dominance
//    static void error(Object object) {
//        String result = switch (object) {
//            case CharSequence cs ->  "A sequence of length " + cs.length();
//            case String s -> "A string " + s.length();
//        }
//    }

//    // Type Coverage in switch Expressions
//    static int coverage(Object object) {
//        return switch (object) {
//            case String s -> s.length();
//            case Integer i -> i;
//        };
//    }

    // Null-Matching case Labels
    static void test(Object object) {
        String result = switch (object) {
            case null -> "null";
            case String s -> "String";
            default -> "default";
        };
        System.out.println(result);
    }
}
