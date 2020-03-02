package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPersonTest {
    @Test
    public void testConstructorTest(){
        String expectedName  = "testName";
        Long expectedId = 0L;
        String actual = TestPerson.testConstructor(0L,"testName");
        String expectedString = expectedName+" " + expectedId;
        Assert.assertEquals(expectedString, actual);
    }

    @Test
    public void testSetNameTest(){
        Person testPerson = new Person(0L,"testName");
        String expected = "Brandi";
        String actual = TestPerson.testSetName(testPerson,"Brandi");

        Assert.assertEquals(expected, actual);
    }
}
