package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradingCalculatorTest {

    @Test
    public void testGradeA() {
        GradingCalculator calculator = new GradingCalculator();
        calculator.setScore(95);
        calculator.setAttendancePercentage(90);
        assertEquals('A', calculator.getGrade());
    }

    @Test
    public void testGradeB1() {
        GradingCalculator calculator = new GradingCalculator();
        calculator.setScore(85);
        calculator.setAttendancePercentage(90);
        assertEquals('B', calculator.getGrade());
    }

    @Test
    public void testGradeC() {
        GradingCalculator calculator = new GradingCalculator();
        calculator.setScore(65);
        calculator.setAttendancePercentage(90);
        assertEquals('C', calculator.getGrade());
    }

    @Test
    public void testGradeB2() {
        GradingCalculator calculator = new GradingCalculator();
        calculator.setScore(95);
        calculator.setAttendancePercentage(65);
        assertEquals('B', calculator.getGrade());
    }

    @Test
    public void testGradeF1() {
        GradingCalculator calculator = new GradingCalculator();
        calculator.setScore(95);
        calculator.setAttendancePercentage(55);
        assertEquals('F', calculator.getGrade());
    }

    @Test
    public void testGradeF2() {
        GradingCalculator calculator = new GradingCalculator();
        calculator.setScore(65);
        calculator.setAttendancePercentage(55);
        assertEquals('F', calculator.getGrade());
    }

    @Test
    public void testGradeF3() {
        GradingCalculator calculator = new GradingCalculator();
        calculator.setScore(50);
        calculator.setAttendancePercentage(90);
        assertEquals('F', calculator.getGrade());
    }
}
