package com.epam.training.anton_pashutkin.exceptions;

import java.util.ArrayList;

public class StudentsList {
    private ArrayList<Student> studentsList = new ArrayList<>();
    public void addStudent(Student student){
        studentsList.add(student);
    }


}
