package io.zipcoder.interfaces;

public final class Instructors extends People{
    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        add(new Instructor(6L, "Dolio"));
        add(new Instructor(7L, "Froilan"));
        add(new Instructor(8L,"Roberto"));
        add(new Instructor(9L, "Nobles"));
        add(new Instructor(10L,"Chris"));
    }

    public static Instructors getInstance(){return INSTANCE;}
}
