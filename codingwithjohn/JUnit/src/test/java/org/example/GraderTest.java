package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    Grader grader = new Grader();

    @Test
    void NinetyShouldAGrade() {
        assertEquals('A', grader.determineLetterGrade(90));
    }

    @Test
    void EightyShouldBGrade() {
        assertEquals('B', grader.determineLetterGrade(80));
    }

    @Test
    void SeventyShouldCGrade() {
        assertEquals('C', grader.determineLetterGrade(70));
    }

    @Test
    void SixtyShouldAGrade() {
        assertEquals('D', grader.determineLetterGrade(60));
    }

    @Test
    void FiftyShouldAGrade() {
        assertEquals('F', grader.determineLetterGrade(50));
    }

    @Test
    void negativeNumberShouldThrowException() {
        assertThrowsExactly(IllegalArgumentException.class, () -> grader.determineLetterGrade(-10));
    }

    @Test
    void OneHundredOneShouldThrowException() {
        assertThrowsExactly(IllegalArgumentException.class, () -> grader.determineLetterGrade(101));
    }

}