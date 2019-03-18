package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classroom {
    private Student[] students;
    List<Student> studentList = new ArrayList<>(Arrays.asList(students));

    public Classroom(){
        this.students = new Student[30];
    }

    public Classroom(int maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students){
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public double getAverageExamScore() {
        double sum = 0.0;
        for (Student student : students) {
                sum += student.examSum();
            } return sum / students.length;
        }

    public void addStudent(Student student){
        studentList.add(student);
        students = studentList.toArray(new Student[0]);
    }

    public void removeStudent(String firstName, String lastName){
        studentList.removeIf(obj -> obj.getFirstName().equals(firstName) && obj.getLastName().equals(lastName));
        students = studentList.toArray(students);
    }

    public Student[] getStudentsbyScore(){
        return Arrays.sort(studentList);
    }

   /* public Map<Students, String> getGradeBook(){

    }*/

    public Classroom classroom = new Classroom();
}
