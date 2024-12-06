package com.yusufcandmrz.patternmatching;

public class Main {

    // instanceof kontrolunden bahset. onceki versiyonu ile farkini goster. //jdk 14'de tanitildi. jdk 16'da tamamlandi
    // switch expression ile kullanimindan bahset. onceki versiyonu ile farkini goster. //jdk 17

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
