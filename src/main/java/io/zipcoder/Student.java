package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;
    
    public Student() {
    }
    
    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getExamScores() {
        String output = "Exam Scores:\n";
        for (int i = 0; i < examScores.size(); i++) {
            output += ("Exam " + (i + 1) + "-> " + examScores.get(i) + "\n");
        }
        return output;
    }
    
    public int getNumberOfExamsTaken() {
        return examScores.size();
    }
    
    public void addExamScore(double examScore) {
        examScores.add(examScore);
    }
    
    public void setExamScore(int examNumber, double newScore) {
        examScores.set(examNumber - 1, newScore);
    }
    
    public double getAverageExamScore() {
        return examSum() / examScores.size();
    }
    
    public double examSum() {
        double sum = 0.0;
        for (double examScore : examScores) {
            sum += examScore;
        }
        return sum;
    }
    
    @Override
    public String toString() {
        return "Student Name: " + firstName + " " + lastName + "\n> Average Score: " + getAverageExamScore() + "\n Exam Scores: \n>\t" + getExamScores();
    }
    
    public Student student = new Student();
}
