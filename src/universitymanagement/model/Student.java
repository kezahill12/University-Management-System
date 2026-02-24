package universitymanagement.model;

import java.util.HashMap;
import java.util.Map;

public class Student extends Person{

    private String studentID;
    private  double GPA;
    private String department;
    private Map<Course,Double>courses;

    public Student(String name, int age, String studentID,double GPA ,String departement) {
        super(name, age);
        this.studentID = studentID;
        this.GPA=GPA;
        this.department=department;
        this.courses = new HashMap<>();


    }

    public String getStidentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getdepartment() {
        return department;
    }

    public void setdepartment(String department) {

        this.department = department;
    }

    public Map<Course, Double> getCourses() {

        return courses;
    }

    public void setCourses(Map<Course, Double> courses) {

        this.courses = courses;
    }

//    public String getStudentID() {
//        return null;
//    }
}
