package School;

public class Department {
    private String departmentID;
    private String departmentName;
    private String departmentHead;

    
    public Department(String departmentID, String departmentName, String departmentHead) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
    }

   
    public Department(String departmentID, String departmentName) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
    }

    
    public Department() {}
}