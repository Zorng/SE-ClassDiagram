package School;

public class Course {
    public String courseID;
    public String courseName;
    public String department;
    public int credit;
    public Lecturer lecturer;
    public String room;
    public String startDate;
    public int duration; 

    public Course(String courseID, String courseName, String department, int credit, String room, String startDate, int duration) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.department = department;
        this.credit = credit;
        this.room = room;
        this.startDate = startDate;
        this.duration = duration;
    }

    public void displayCourseInfo() {}

    public void printSchedule() {}

    public String getLecturerName() {
        return lecturer.name;
    }

    public String getCourseSummary() {
        return "";
    }
}
