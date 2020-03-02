package io.zipcoder.interfaces;

public class TestPerson {

    public TestPerson(){}
    public static String testConstructor(Long id, String name){
        Person newPerson = new Person(id,name);
        return newPerson.getName()+ " " + newPerson.getId();
    }

    public static String testSetName(Person newPerson, String name){
        newPerson.setName(name);
        return newPerson.getName();
    }


}
