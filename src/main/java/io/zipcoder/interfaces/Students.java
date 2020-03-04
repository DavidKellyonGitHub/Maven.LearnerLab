package io.zipcoder.interfaces;

public final class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    private Students(){

        Student jimmy = new Student(0L,"Jimmy");
        add(jimmy);
        Student chip = new Student(1L, "Chip");
        add(chip);
        Student ujjwal = new Student(2L, "Ujjwal");
        add(ujjwal);
        Student destiny = new Student(3L, "Destiny");
        add(destiny);
        Student chris =new Student(4L, "Chris");
        add(chris);
        Student dave = new Student(5L, "Dave");
        add(dave);
    }

    public static Students getInstance(){
        return INSTANCE;
    }


    @Override
    public Student[] getArray() {
        return personList.toArray(new Student[0]);
    }
}