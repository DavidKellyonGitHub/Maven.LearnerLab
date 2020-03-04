package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    Person newPerson = new Person(0L, "Bing Bong");
    People newPeople = new People();

    @Test
    public void testAdd(){
        newPeople.add(newPerson);
        String expected = newPerson.getName();
        String actual = newPeople.findById(0L).getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove(){
        newPeople.add(newPerson);
        Assert.assertFalse(newPeople.personList.isEmpty());
        newPeople.remove(newPerson);
        Assert.assertTrue(newPeople.personList.isEmpty());
    }

    @Test
    public void testFindByID(){
        newPeople.add(newPerson);
        Assert.assertEquals(newPerson, newPeople.findById(0L));
    }

}
