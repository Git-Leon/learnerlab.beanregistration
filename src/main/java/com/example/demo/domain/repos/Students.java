package com.example.demo.domain.repos;

import com.example.demo.domain.model.Student;

/**
 * @author leon on 8/27/18.
 */
public class Students extends People<Student> {
    public Students(Student... students) {
        super(students);
    }
}
