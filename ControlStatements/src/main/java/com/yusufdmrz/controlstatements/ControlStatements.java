/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.yusufdmrz.controlstatements;

import java.awt.BorderLayout;

/**
 *
 * @author Yusuf
 */
public class ControlStatements {
    
    public enum Day {Sun, Mon, Tue, Wed, Thu, Fri, Sat}

    public static void main(String[] args) {

        // JAVA CONTROL STATEMENTS
        /* // If Statement
        int x = 10;
        int y = 12;
        if (x + y > 20) {
            System.out.println((x + y) + " is greater than 20");
        }

        if (x + y <= 10) {
            System.out.println((x + y) + " is less or equal than 10");
        } else {
            System.out.println((x + y) + " is greater than 10");
        }

        String city = "Delhi";
        if (city == "Meerut") {
            System.out.println("City is Meerut");
        } else if (city == "Noida") {
            System.out.println("City is Noida");
        } else if (city == "Agra") {
            System.out.println("City is Agra");
        } else {
            System.out.println("City is " + city);
        }

        String address = "Delhi, India";
        if (address.endsWith("India")) {
            if (address.contains("Meerut")) {
                System.out.println("Your city is Meerut");
            } else if (address.contains("Noida")) {
                System.out.println("Your city is Noida");
            } else {
                System.out.println("Your city is " + address.split(",")[0]);
            }
        } else {
            System.out.println("You are not living in India");
        }

        // *********************************************************************
        // Switch Statement
        int number = 2;
        switch (number) {
            case 0:
                System.out.println("Number is 0");
                break;
            case 1:
                System.out.println("Number is 1");
                break;
            default:
                System.out.println("Number is " + number);
        }

        // *********************************************************************
        // Loop Statements
        // for loop
        int sum = 0;
        for (int number2 = 1; number2 <= 10; number2++) {
            sum += number2;
        }
        System.out.println("The sum of first 10 natural numbers is " + sum);

        // for-each loop
        String[] names = {"Java", "C", "C++", "Python", "JavaScript"};
        System.out.println("Printing the content of the names array...");
        for (String name : names) {
            System.out.println(name);
        }

        // while loop
        int number3 = 0;
        while (number3 <= 10) {
            System.out.println("Number3 is " + number3);
            number3 += 2;
        }

        // do-while loop
        int number4 = 0;
        do {
            System.out.println("Number 4 is " + number4);
            number4 += 2;
        } while (number4 <= 10);

        // *********************************************************************
        // Jump Statements
        // break statement
        for (int number5 = 1; number5 <= 10; number5++) {
            if (number5 == 5) {
                System.out.println("loop breaked");
                break;
            }
            System.out.println("Number5 is " + number5);
        }

        a:
        for (int number6 = 1; number6 <= 10; number6++) {
            b:
            for (int number7 = 1; number7 <= 10; number7++) {
                c:
                for (int number8 = 1; number8 <= 10; number8++) {
                    if (number8 == 5) {
                        System.out.println("loop breaked");
                        break a;
                    }
                }
            }
        }

        // continue statement
        for (int number9 = 1; number9 <= 10; number9++) {
            if (number9 == 5) {
                continue;
            }
            System.out.println("Number9 is " + number9);
        } */
        
        
        
        // *********************************************************************
        // *********************************************************************
        // *********************************************************************
        // JAVA IF-ELSE
        // if Statement
        /* int number = 20;
        if (number > 18) {
            System.out.println("number is greater than 18");
        }
        
        // if-else Statement
        int number2 = 13;
        if (number % 2 == 2) {
            System.out.println("number2 is even number");
        } else {
            System.out.println("number2 is odd number");
        }
        
        int currentYear = 2024;
        if (currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0) {
            System.out.println("currentYear is leap year");
        } else {
            System.out.println("currentYear is common year");
        }
        
        // Ternary Operator
        int number3 = 13;
        String output = (number3 % 2 == 0) ? "even number" : "odd number";
        System.out.println("number3 is " + output);
        
        // if-else-if ladder Statement
        int mark = 65;
        if (mark < 50) {
            System.out.println("fail");
        } else if (mark >= 50 && mark < 60) {
            System.out.println("D grade");
        } else if (mark >= 60 && mark < 70) {
            System.out.println("C grade");
        } else if (mark >= 70 && mark < 80) {
            System.out.println("B grade");
        } else if (mark >= 80 && mark < 90) {
            System.out.println("A grade");
        } else if (mark >= 90 && mark <= 100) {
            System.out.println("A+ grade");
        } else {
            System.out.println("invalid!");
        }
        
        int number4 = -13;
        if (number4 > 0) {
            System.out.println("POSITIVE");
        } else if (number4 < 0) {
            System.out.println("NEGATIVE");
        } else {
            System.out.println("ZERO");
        }
        
        // Nested if Statement
        int age = 25;
        int weight = 100;
        if (age > 18) {
            if (weight > 50) {
                System.out.println("You are eligible to donate blood");
            }
        }
        
        if (age > 18) {
            if (weight > 50) {
                System.out.println("You are eligible to donate blood");
            } else {
                System.out.println("You are not eligible to donate blood");
            }
        } else {
            System.out.println("Age must be greater than 18");
        } */
        
        
        
        // *********************************************************************
        // *********************************************************************
        // *********************************************************************
        // JAVA SWITCH
        // Switch Statement
        /* int number5 = 20;
        switch (number5) {
            case 10:
                System.out.println("number5 is 10");
                break;
            case 20:
                System.out.println("number5 is 20");
                break;
            case 30:
                System.out.println("number5 is 30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }
        
        // Finding Month
        int month = 7;
        String monthString = "";
        switch (month) {
            case 1:
                monthString = "1 - January";
                break;
            case 2:
                monthString = "2 - February";
                break;
            case 3:
                monthString = "3 - March";
                break;
            case 4:
                monthString = "4 - April";
                break;
            case 5:
                monthString = "5 - May";
                break;
            case 6:
                monthString = "6 - June";
                break;
            case 7:
                monthString = "7 - July";
                break;
            case 8:
                monthString = "8 - August";
                break;
            case 9:
                monthString = "9 - September";
                break;
            case 10:
                monthString = "10 - October";
                break;
            case 11:
                monthString = "11 - November";
                break;
            case 12:
                monthString = "12 - December";
                break;
            default:
                System.out.println("Invalid month!");
        }
        System.out.println(monthString);
        
        // Check Vowel or Consonant
        char ch = 'O';
        String result = switch (ch) {
            case 'a', 'A' ->
                "Vowel";
            case 'e', 'E' ->
                "Vowel";
            case 'i', 'I' ->
                "Vowel";
            case 'o', 'O' ->
                "Vowel";
            case 'u', 'U' ->
                "Vowel";
            default ->
                "Consonant";
        };
        System.out.println("ch is " + result);
        
        // Fall-through
        int number6 = 20;
        switch (number6) {
            case 10:
                System.out.println("number6 is 10");
            case 20:
                System.out.println("number6 is 20");
            case 30:
                System.out.println("number6 is 30");
            default:
                System.out.println("Not in 10, 20 or 30");
        }
        
        // Statement with String
        String levelString = "Expert";
        int level = switch (levelString) {
            case "Beginner" ->
                1;
            case "Intermediate" ->
                2;
            case "Expert" ->
                3;
            default ->
                0;
        };
        System.out.println("Your level is " + level);
        
        // Nested Switch Statement
        char branch = 'C';
        int collegeYear = 4;
        switch (collegeYear) {
            case 1 -> {
                System.out.println("English, Maths, Science");
            }
            case 2 -> {
                switch (branch) {
                    case 'C' -> {
                        System.out.println("Operating System, Java, Data Structure");
                    }
                    case 'E' -> {
                        System.out.println("Micro processors, Logic swithing theory");
                    }
                    case 'M' -> {
                        System.out.println("Drawing, Manufacturing Machines");
                    }
                }
            }
            case 3 -> {
                switch (branch) {
                    case 'E' -> {
                        System.out.println("Fundamentalss of Logic Design, Microelectronics");
                    }
                    case 'M' -> {
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                    }
                }
            }
            case 4 -> {
                switch (branch) {
                    case 'C' -> {
                        System.out.println("Data Communication and Networks, MultiMedia");
                    }
                    case 'E' -> {
                        System.out.println("Embedded System, Image Processing");
                    }
                    case 'M' -> {
                        System.out.println("Production Technology, Thernal Engineering");
                    }
                }
            }
        }
        
        // Enum in Switch Statement
        Day[] DayNow = Day.values();
        for (Day now : DayNow) {
            switch (now) {
                case Sun -> {
                    System.out.println("Sunday");
                }
                case Mon -> {
                    System.out.println("Monday");
                }
                case Tue -> {
                    System.out.println("Tuesday");
                }
                case Wed -> {
                    System.out.println("Wednesday");
                }
                case Thu -> {
                    System.out.println("Thursday");
                }
                case Fri -> {
                    System.out.println("Friday");
                }
                case Sat -> {
                    System.out.println("Saturday");
                }
            }
        }
        
        // Wrapper in Switch Statement
        Integer age = 18;
        switch (age) {
            case (16) -> {
                System.out.println("You are under 18");
            }
            case (18) -> {
                System.out.println("You are eligible for vote");
            }
            case (65) -> {
                System.out.println("You are senior citizen");
            }
            default -> {
                System.out.println("Please five the valid age");
            }
        } */
        
        
        
        // *********************************************************************
        // *********************************************************************
        // *********************************************************************
        // JAVA FOR LOOP
        // Simple for Loop
        /* for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        
        // Nested for Loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
        
        // Pyramid
        for (int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Pyramid II
        for (int i = 1; i <= 5; i++) {
            for(int j = 5; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // ForEach
        int[] arr = {12, 24, 36, 48, 60, 72, 84, 96};
        for (int number : arr) {
            System.out.println("number is -> " + number);
        }
        
        // Labeled for
        aa:
        for (int i = 1; i <= 3; i++) {
            bb:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa;
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
        
        // Infinitive for Loop
        // for(;;){
        //    System.out.println("infinitive loop");
        // } */
        
        
        
        // *********************************************************************
        // *********************************************************************
        // *********************************************************************
    }
}
