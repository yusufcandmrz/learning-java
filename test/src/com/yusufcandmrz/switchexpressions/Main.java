package com.yusufcandmrz.switchexpressions;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Main {

    // switch Statements
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

    public static void printIsWeekend(Day today) {
        switch (today) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("no, it is not");
            case SATURDAY, SUNDAY -> System.out.println("yes, it is");
        }
    }

    public static String printIsWeekendTwo(Day today) {
        return switch (today) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "no, it is not";
            case SATURDAY, SUNDAY -> "yes, it is";
        };
    }

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

        // https://www.baeldung.com/java-switch

        // switch Expressions without return
        // printIsWeekend(Day.MONDAY);

        // switch Expression with return
        // System.out.println(printIsWeekendTwo(Day.MONDAY));

        // Using yield keyword
        // System.out.println(printIsWeekendThree(Day.MONDAY));
    }
}
