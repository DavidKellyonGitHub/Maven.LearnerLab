package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    Person testPerson = new Person(0L, "Dave");
    @Test
    public void testConstructor(){
        String expectedName  = "Dave";
        Long expectedId = 0L;
        String actual = testPerson.getName() + " " + testPerson.getId();
        String expectedString = expectedName+ " " + expectedId;
        Assert.assertEquals(expectedString, actual);
    }

    @Test
    public void testSetNameTest(){
        testPerson.setName("Brandi");
        String expected = "Brandi";
        String actual = (testPerson.getName());

        Assert.assertEquals(expected, actual);
    }
}
