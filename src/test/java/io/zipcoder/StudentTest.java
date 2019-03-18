package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTest {
    private String firstName;
    private String lastName;
    private Double[] examScores = {70.0, 81.2, 93.4, 100.0};
    private Student student;

    @Before
    public void setUp() throws Exception {
        //this.examScores = new Double[]{70.0, 81.2, 93.4, 100.0};
        this.student = new Student("Mark", "Moll", examScores);
    }

    @Test
    public void getExamScoresTest() {
        //Given
        Student student = new Student();
        //When
        List<String> expectedOutcome = Arrays.asList(student.getExamScores());
        //Then
        for (Double exam : examScores) {
            Assert.assertTrue(expectedOutcome.contains(exam));
        }
    }

    @Test
    public void addExamScoreTest() {
        //Given
        //When
        //Then
    }

    @Test
    public void setExamScoresTest() {
        //Given
        //When
        //Then
    }

    @Test
    public void getAverageExamScoreTest() {
        //Given

        //When
        //Then
    }

    @Test
    public void toStringTest() {
    }
}