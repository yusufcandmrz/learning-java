package org.example;

public class Grader {

    public char determineLetterGrade(int numberGrade) {
        if (numberGrade < 0 || numberGrade > 100) {
            throw new IllegalArgumentException("Number must be between 0 and 100");
        } else if (numberGrade >= 90) {
            return 'A';
        } else if (numberGrade >= 80) {
            return 'B';
        } else if (numberGrade >= 70) {
            return 'C';
        } else if (numberGrade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
