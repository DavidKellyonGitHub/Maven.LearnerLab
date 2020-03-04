package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    ;
    enum instructorName{
        dolio, chris, nobles, roberto, froilan
    }

    Instructor instructor;
    double timeWorked;

    Instructor dolio(){
        instructor = Instructors.getInstance().findById(6L);
        Instructors.getInstance().add(instructor);
        return instructor;
    }

    Instructor froilan(){
        instructor = Instructors.getInstance().findById(7L);
        Instructors.getInstance().add(instructor);
        return instructor;
    }

    Instructor roberto(){
        instructor = Instructors.getInstance().findById((8L));
        Instructors.getInstance().add(instructor);
        return instructor;

    }

    Instructor nobles(){
        instructor = Instructors.getInstance().findById(9L);
        Instructors.getInstance().add(instructor);
        return instructor;
    }

    Instructor chris(){
         instructor = Instructors.getInstance().findById(10L);
        Instructors.getInstance().add(instructor);
         return instructor;
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
