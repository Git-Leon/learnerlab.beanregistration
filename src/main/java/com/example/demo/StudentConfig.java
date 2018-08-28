package com.example.demo;

import com.example.demo.domain.model.Student;
import com.example.demo.domain.repos.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author leon on 8/27/18.
 */
@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        return new Students(
                new Student(0L, "Sam"),
                new Student(1L, "Alex"),
                new Student(2L, "Jan"),
                new Student(3L, "Caden"));
    }

    @Bean
    public Students previousStudents() {
        return new Students(
                new Student(0L, "Jen"),
                new Student(1L, "Kit"),
                new Student(2L, "Kai"),
                new Student(3L, "Cameron"));
    }
}
