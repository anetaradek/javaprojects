package PersonAndStudent;

import java.time.LocalDate;

public class Student extends Person {
    String faculty;
    int graduateYear;

    public Student(String firstName, String lastName, LocalDate birthday, String faculty, int graduateYear) {
        super(firstName, lastName, birthday);
        this.faculty = faculty;
        this.graduateYear = graduateYear;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getGraduateYear() {
        return graduateYear;
    }

    public void setGraduateYear(int graduateYear) {
        this.graduateYear = graduateYear;
    }
}
