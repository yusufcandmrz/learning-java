package com.yusufcandmrz.switchexpressions;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Main {

    // Switch Statements
    public static void printIsWeekendWithOldWay(Day today) {
        switch (today) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("no, it is not");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("yes, it is");
                break;
        }
    }

    // Switch Statements with yield
    public static String printIsWeekendThreeWithOldWay(Day today) {
        return switch (today) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                yield "no, it is not";
            case SATURDAY:
            case SUNDAY:
                yield "yes, it is";
        };
    }

    // Switch Expressions
    public static void printIsWeekend(Day today) {
        switch (today) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("no, it is not");
            case SATURDAY -> System.out.println("yes, it is");
        }
    }

    // Switch Expressions with return
    public static String printIsWeekendTwo(Day today) {
        return switch (today) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "no, it is not";
            case SATURDAY, SUNDAY -> "yes, it is";
        };
    }

    // Switch Expressions with yield
    public static String printIsWeekendThree(Day today) {
        return switch (today) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                System.out.println("you are going to work today");
                yield "no, it is not";
            }
            case SATURDAY, SUNDAY -> "yes, it is";
        };
    }

    public static void main(String[] args) {

//         // Switch Expressions
//         printIsWeekend(Day.MONDAY);
//
//        // Switch Expressions with return
//        System.out.println(printIsWeekendTwo(Day.MONDAY));
//
//        // Switch Expressions with yield
//        System.out.println(printIsWeekendThree(Day.MONDAY));
    }
}
