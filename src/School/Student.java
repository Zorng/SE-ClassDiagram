package School;

public class Student extends Person {
    private String studentId;
    private String password;
    private int year;
    private String department;
    private String major;
    private String email;
    private Course[] enrolledCourses;

    Student(String name, int age, String dob, String address, String phone, String ssn,
            String studentId, String password, int year, String department, String major, String email) {
        super(name, age, dob, address, phone, ssn);
        this.studentId = studentId;
        this.password = password;
        this.year = year;
        this.department = department;
        this.major = major;
        this.email = email;
    }

    Student(String studentId, int year) {
        this.studentId = studentId;
        this.year = year;
    }

    Student() {}

    private boolean submitAssignment() {
        return true;
    }

    private void checkGrade() {

    }

    private void checkCourse() {

    }
}
