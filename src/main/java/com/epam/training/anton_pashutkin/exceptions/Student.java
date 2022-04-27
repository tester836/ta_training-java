package com.epam.training.anton_pashutkin.exceptions;

public class Student {
    private String studentName;
    private String faculty;
    private String group;
    private String subject;
    private double rating;

    public Student(
            String studentName,
            String faculty,
            String group,
            String subject,
            double rating) {
        this.studentName = studentName;
        this.faculty = faculty;
        this.group = group;
        this.subject = subject;
        this.rating = rating;
    }


    public String getStudentName(){
        return studentName;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getGroup() {
        return group;
    }

    public String getSubject() {
        return subject;
    }

    public double getRating() {
        return rating;
    }


    public String toString() {
        return "Student " + getStudentName() + " studying in " + getFaculty() +
                " faculty " + getGroup() + " group on " + getSubject() +
                " subject with rating " + getRating() ;
    }

}
