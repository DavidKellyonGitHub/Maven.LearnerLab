package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    dolio(6L, "Dolio"),
    chris(10L, "Chris"),
    nobles(9L, "Nobles"),
    roberto(8L, "Roberto"),
    froilan(7L, "Froilan");

    final Instructor instructor;
    private double timeWorked = 0;

    Educator(long id, String name){
        this.instructor = new Instructor(id,name);
        Instructors.getInstance().add(this.instructor);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner,numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners,numberOfHours);
        timeWorked += numberOfHours;
    }
}
