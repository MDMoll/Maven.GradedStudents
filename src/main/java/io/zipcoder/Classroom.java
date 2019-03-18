package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classroom {
    private Student[] students;
    List<Student> studentList = new ArrayList<>(Arrays.asList(students));
    
    public Classroom classroom = new Classroom();
    
    public Classroom() {
        this.students = new Student[30];
    }
    
    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }
    
    public Classroom(Student[] students) {
        this.students = students;
    }
    
    public Student[] getStudents() {
        return students;
    }
    
    public double getAverageExamScore() {
        double sum = 0.0;
        for (Student student : students) {
            sum += student.examSum();
        }
        return sum / students.length;
    }
    
    public void addStudent(Student student) {
        studentList.add(student);
        students = studentList.toArray(new Student[0]);
    }
    
    public void removeStudent(String firstName, String lastName) {
        studentList.removeIf(obj -> obj.getFirstName().equals(firstName) && obj.getLastName().equals(lastName));
        students = studentList.toArray(students);
    }
    
    public String[] getStudentsByScore() {
        List<Student> studentList = new ArrayList<>(Arrays.asList(this.students));
        List<String> examList = new ArrayList<>();
        for (Student student : studentList) {
            String examScores = student.getExamScores();
            examList.add(examScores);
        }
        return examList.toArray(new String[0]);
    }
    
    public String getGradebook() {
        List<Student> studentList = new ArrayList<>(Arrays.asList(this.students));
        StringBuilder result = new StringBuilder();
        for (Student student : studentList) {
            if (student.getAverageExamScore() < 60) {
                result.append(student.getFirstName()).append(": F");
            } else if (student.getAverageExamScore() < 71) {
                result.append(student.getFirstName()).append(": D");
            } else if (student.getAverageExamScore() < 81) {
                result.append(student.getFirstName()).append(": C");
            } else if (student.getAverageExamScore() < 91) {
                result.append(student.getFirstName()).append(": B");
            } else {
                result.append(student.getFirstName()).append(": A");
            }
        }
        return result.toString();
    }
}
