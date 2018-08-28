package com.example.demo.domain.repos;

import com.example.demo.domain.model.Instructor;

/**
 * @author leon on 8/27/18.
 */
public class Instructors extends People<Instructor> {
    public Instructors(Instructor... instructors) {
        super(instructors);
    }
}
