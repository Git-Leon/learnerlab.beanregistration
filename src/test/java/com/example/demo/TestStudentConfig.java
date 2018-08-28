package com.example.demo;

import com.example.demo.domain.repos.Students;
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
public class TestStudentConfig {
    @Autowired
    @Qualifier("students")
    private Students currentStudents;

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Test
    public void testCurrentStudents() {
        String expected = "People{personList=[Person{id=0, name='Sam'}, Person{id=1, name='Alex'}, Person{id=2, name='Jan'}, Person{id=3, name='Caden'}]}";
        String actual = currentStudents.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPreviousStudents() {
        String expected = "People{personList=[Person{id=0, name='Jen'}, Person{id=1, name='Kit'}, Person{id=2, name='Kai'}, Person{id=3, name='Cameron'}]}";
        String actual = previousStudents.toString();
        Assert.assertEquals(expected, actual);
    }
}
