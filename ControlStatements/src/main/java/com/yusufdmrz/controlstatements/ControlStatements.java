/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.yusufdmrz.controlstatements;

/**
 *
 * @author Yusuf
 */
public class ControlStatements {

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
        int number = 20;
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
        }
    }
}
