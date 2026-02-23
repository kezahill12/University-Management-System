package universitymanagement.model;

public class Instructor extends Person {

    private int instructorID;
    private String department;

    public Instructor(String name, int age, int instructorID, String department){
        super(name,age);
        this.instructorID=instructorID;
        this.department=department;
    }

    public int getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(int instructorID) {
        this.instructorID = instructorID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
