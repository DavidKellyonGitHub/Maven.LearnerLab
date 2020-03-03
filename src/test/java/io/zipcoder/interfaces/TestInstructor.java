package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    Instructor testInstructor = new Instructor(0L, "Dave");
    Student testStudent = new Student(0L,"Evad");

    @Test
    public void testImplementation(){
        Assert.assertTrue(testInstructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(testInstructor instanceof Person);
    }


}
