package universitymanagement.model;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private int courseID;
    private String courseName;
    private int credits;
    private int capacity;
    private List<Student> students;

    public Course(int courseID,String courseName,int credits,int capacity){
        this.courseID=courseID;
        this.courseName=courseName;
        this.credits =credits;
        this.capacity=capacity;
        this.students=new ArrayList<>();
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public boolean addStudent(Student student){
        if(students.size()<capacity){
            students.add(student);
            return true;
        }
        else {
            System.out.println("course is full! ");
        }
        return false;
    }
}


