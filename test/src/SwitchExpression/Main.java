package SwitchExpression;

enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Main {
    public static void main(String[] args) {
        String day = SwitchExpression.Days.FRIDAY.toString();
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