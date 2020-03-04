package io.zipcoder.interfaces;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import org.junit.Assert;
import org.junit.Test;

public final class TestStudentsSingleton {
Students students = Students.getInstance();

    @Test
    public void testSingleton(){
        boolean expected = students.contains(students.findById(0L));
        Assert.assertTrue(expected);
    }
}
