package com.example.demo.domain.model;

/**
 * @author leon on 8/27/18.
 */
public class Student extends Person implements Learner {
    private double totalNumberOfHoursLearned;

    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalNumberOfHoursLearned += numberOfHours;
    }

    public double getTotalNumberOfHoursLearned() {
        return totalNumberOfHoursLearned;
    }
}
