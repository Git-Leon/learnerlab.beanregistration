package com.example.demo.domain.repos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author leon on 8/27/18.
 */
@Component
public class Alumni {
    @Autowired
    @Qualifier("previousStudents")
    private Students students;

    @Autowired
    private Instructors instructors;

    @PostConstruct
    public void executeBootcamp() {
        int numberOfInstructors = instructors.size();
        int numberOfStudents = students.size();
        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double numberOfHoursPerTeacher = numberOfHoursToTeach / numberOfInstructors;

        instructors.findAll().parallelStream()
                .forEach(instructor -> instructor.lecture(students, numberOfHoursPerTeacher));
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
