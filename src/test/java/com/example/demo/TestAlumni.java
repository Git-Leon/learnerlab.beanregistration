package com.example.demo;

import com.example.demo.domain.repos.Alumni;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author leon on 8/27/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAlumni {
    @Autowired
    private Alumni alumni;

    @Test
    public void test() {
        alumni.getStudents().forEach(student ->
                Assert.assertEquals(1200, student.getTotalNumberOfHoursLearned(), 0.1));
    }
}
