package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    Student testStudent = new Student(0L,"Dave");
    @Test
        public void testImplementation(){
        Assert.assertTrue(testStudent instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(testStudent instanceof Person);
    }

    @Test
    public void testLearn(){
        double beforeLearn = testStudent.getTotalStudyTime();
        testStudent.learn(1);
        Assert.assertTrue(beforeLearn + 1 == testStudent.getTotalStudyTime());
    }


}
