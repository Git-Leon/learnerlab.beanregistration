package com.example.demo.domain.dtos;

import com.example.demo.domain.repos.Instructors;
import com.example.demo.domain.repos.Students;
import com.example.demo.domain.model.Teacher;

/**
 * @author leon on 8/27/18.
 */
public class Classroom {
    private Instructors instructors;
    private Students students;

    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teacher teacher, Double numberOfHours) {
        teacher.lecture(students, numberOfHours);
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public Students getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "instructors=" + instructors +
                ", students=" + students +
                '}';
    }
}
