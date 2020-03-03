package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    Instructor testInstructor = new Instructor(0L, "Dave");
    Student testStudent = new Student(0L,"Evad");
    Learner[] learners = new Learner[]{testStudent};

    @Test
    public void testImplementation(){
        Assert.assertTrue(testInstructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(testInstructor instanceof Person);
    }

    @Test
    public void testTeach(){
        double beforeTeach = testStudent.getTotalStudyTime();
        testInstructor.teach(testStudent, 1);
        Assert.assertTrue( beforeTeach+1 == testStudent.getTotalStudyTime());

    }

    @Test
    public void testLecture(){
        double beforeLecture = testStudent.getTotalStudyTime();
        testInstructor.lecture(learners, 1);
        Assert.assertTrue(beforeLecture +1 == testStudent.getTotalStudyTime());
    }
}
