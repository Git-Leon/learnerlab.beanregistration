package com.example.demo.domain.model;

/**
 * @author leon on 8/27/18.
 */
public class Instructor extends Person implements Teacher {
    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        learners.forEach(learner -> teach(learner, numberOfHours));
    }
}
