package io.zipcoder.interfaces;

public class ZipCodeWilmington {
Students students = Students.getInstance();
Instructors instructors = Instructors.getInstance();

public void hostLecture (Teacher teacher, double numberOfHours){
    teacher.lecture(students.getArray(), numberOfHours);
}
public void hostLecture(long id, double numberOfHours){
    hostLecture(instructors.findById(id), numberOfHours);
}

}
