package com.example.demo;

import com.example.demo.domain.dtos.Classroom;
import com.example.demo.domain.repos.Instructors;
import com.example.demo.domain.repos.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author leon on 8/27/18.
 */
@Configuration
public class ClassroomConfig {
    @Bean
    public Classroom currentCohort(
            @Qualifier("instructors") Instructors instructors,
            @Qualifier("students") Students students) {
        return new Classroom(instructors, students);
    }
}
