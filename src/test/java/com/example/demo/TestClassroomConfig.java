package com.example.demo;

import com.example.demo.domain.dtos.Classroom;
import com.example.demo.domain.repos.Instructors;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author leon on 8/27/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClassroomConfig {
    @Autowired
    @Qualifier("currentCohort")
    private Classroom allInstructors;

    @Test
    public void test() {
        String expected = "Classroom{instructors=People{personList=[Person{id=7, name='Nhu'}, Person{id=8, name='Kris'}, Person{id=0, name='Dominique'}, Person{id=1, name='Wilhem'}, Person{id=2, name='Leon'}, Person{id=3, name='Tariq'}, Person{id=4, name='Froilan'}, Person{id=5, name='Tariq'}, Person{id=6, name='Dolio'}]}, students=People{personList=[Person{id=0, name='Sam'}, Person{id=1, name='Alex'}, Person{id=2, name='Jan'}, Person{id=3, name='Caden'}]}}";
        String actual = allInstructors.toString();
        Assert.assertEquals(expected, actual);
    }
}
