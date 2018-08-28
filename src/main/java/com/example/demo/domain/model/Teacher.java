package com.example.demo.domain.model;

/**
 * @author leon on 8/27/18.
 */
public interface Teacher {
    void teach(Learner learner, double numberOfHours);
    void lecture(Iterable<? extends Learner> learners, double numberOfHours);
}
