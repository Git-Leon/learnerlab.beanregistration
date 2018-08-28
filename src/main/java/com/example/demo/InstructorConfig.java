package com.example.demo;

import com.example.demo.domain.model.Instructor;
import com.example.demo.domain.repos.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author leon on 8/27/18.
 */
@Configuration
public class InstructorConfig {
    @Bean
    public Instructors tcUsaInstructors() {
        return new Instructors(
                new Instructor(0L, "Dominique"),
                new Instructor(1L, "Wilhem"),
                new Instructor(2L, "Leon"),
                new Instructor(3L, "Tariq"));
    }

    @Bean
    public Instructors tcUkInstructors() {
        return new Instructors(
                new Instructor(4L, "Froilan"),
                new Instructor(5L, "Tariq"),
                new Instructor(6L, "Dolio"));
    }

    @Bean
    @Primary
    public Instructors instructors() {
        Instructors instructors = new Instructors(
                new Instructor(7L, "Nhu"),
                new Instructor(8L, "Kris"));
        instructors
                .addAll(tcUsaInstructors())
                .addAll(tcUkInstructors());
        return instructors;
    }
}
