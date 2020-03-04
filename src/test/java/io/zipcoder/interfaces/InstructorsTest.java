package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {
Instructors instructors = Instructors.getInstance();
    @Test
    public void testInstructorSingleton() {

        Assert.assertTrue(instructors.contains(instructors.findById(6L)));
    }
}