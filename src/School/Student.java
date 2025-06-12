package School;

public class Student extends Person{
    private String studentId;
    private String password;
    private int year;
    private String department;
    private String major;
    private String email;
    private Course[] enrolledCourses;

    Student(String studentId, String password, int year, String department, String major, String email) {
        this.studentId = studentId;
        this.password = password;
        this.year = year;
        this.department = department;
        this.major = major;
        this.email = email;
    }

    Student(String studentId, int year){
        this.studentId = studentId;
        this.year = year;
    }

    Student(){}

    private boolean submitAssignment(){

        return true;
    }
    
    private void checkGrade(){

    }

    private void checkCourse(){

    }
}
