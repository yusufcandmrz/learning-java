package com.yusufcandmrz.jdk14.switchexpressions;

enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Main {

    // Makes switch usable

    public static void main(String[] args) {

        /* int day = 5;
        String result;
        switch (day) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            default:
                result = "Weekend";
                break;
        } */

        /* int day = 5;
        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Weekend";
        }; */

        /* String result = switch (day) {
        case 1, 2, 3 -> {
        System.out.println("It's a weekday");
        yield "Weekday"; // Use `yield` to return a value.
        default -> "Weekend";
        }; */


        // ***********************************************
        // ***********************************************
        // ***********************************************


        String day = Days.FRIDAY.toString();
        int dayNumber = switch (day) {
            case "SUNDAY" -> 7;
            case "MONDAY" -> 1;
            case "TUESDAY" -> 2;
            case "WEDNESDAY" -> 3;
            case "THURSDAY" -> 4;
            case "FRIDAY" -> 5;
            case "SATURDAY" -> 6;
            default -> 0;
        };
        System.out.println("Day number -> " + dayNumber);

        /* switch (day) {
            case "SUNDAY":
                dayNumber = 7;
                break;
            case "MONDAY":
                dayNumber = 1;
                break;
            case "TUESDAY":
                dayNumber = 2;
                break;
            case "WEDNESDAY":
                dayNumber = 3;
                break;
            case "THURSDAY":
                dayNumber = 4;
                break;
            case "FRIDAY":
                dayNumber = 5;
                break;
            case "SATURDAY":
                dayNumber = 6;
                break;
            default:
                dayNumber = 0;
        }
        System.out.println(dayNumber); */
    }
}