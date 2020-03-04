package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {
    Instructor dolio;
    Student testStudent = new Student(11L, "Oilod");
    Learner[] learners = new Learner[]{testStudent};

    @Test
    public void testImplementation(){
        Assert.assertTrue(dolio instanceof Teacher);

    }

    @Test
    public void testTeach(){
        double expected = testStudent.getTotalStudyTime()+1;
        dolio.teach(testStudent, 1);
        Assert.assertTrue(expected == testStudent.getTotalStudyTime());
    }

    @Test
    public void testLecture(){
        double expected = testStudent.getTotalStudyTime()+1;
        dolio.lecture(learners, 1);
        Assert.assertTrue(expected == testStudent.getTotalStudyTime());
    }
}