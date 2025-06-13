package School;

public class Lecturer extends Person {
    private String lecturerID;
    private String department;
    private String email;
    private String password;
    private Course[] lecturedCourses;

    Lecturer(String name, int age, String dob, String address, String phone, String ssn,
             String lecturerID, String department, String email, String password) {
        super(name, age, dob, address, phone, ssn);  // call Person's constructor
        this.lecturerID = lecturerID;
        this.department = department;
        this.email = email;
        this.password = password;
    }

    Lecturer(String lecturerID, String department) {
        this.lecturerID = lecturerID;
        this.department = department;
    }

    Lecturer() {}

    private boolean addAssignment() {

        return true;
    }

    private void checkAttendance() {

    }

    private boolean giveGrade() {

        return true;
    }
}
