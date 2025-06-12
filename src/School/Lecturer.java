package School;

public class Lecturer extends Person {
    private String lecturerID;
    private String department;
    private String email;
    private String password;
    private Course[] lecturedCoures;

    Lecturer(String lecturerID, String department, String email, String password) {
        this.lecturerID = lecturerID;
        this.department = department;
        this.email = email;
        this.password = password;
    }

    Lecturer() {}

    private boolean addAssignment(Attachment attachment){

        return false;
    }

    private void checkAttendance() {

    }

    private boolean giveGrade() {

        return false;
    }
}
