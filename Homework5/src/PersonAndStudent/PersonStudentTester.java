package PersonAndStudent;

import java.time.LocalDate;

public class PersonStudentTester {
    public static void main(String[] args) {

        Student student = new Student("Adam", "Makowiecki", LocalDate.of(1989, 12, 04), "Automatyka", 5);
        System.out.println("The student's graduate year is " + student.getGraduateYear());
        System.out.println("The student's faculty is " + student.getFaculty());
        System.out.println("The student's birthday is " + student.getBirthday());
    }
}
