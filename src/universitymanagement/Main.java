package universitymanagement;

import  universitymanagement.exception.CourseFullException;
import universitymanagement.exception.StudentAlreadyEnrolledException;
import universitymanagement.service.UniversityManager;
import universitymanagement.model.*;

public class Main {
    public static void main(String[] args) {

        UniversityManager manager = new UniversityManager();

                Student s1 = new Student("Kamanzi", 21, "001", 3.5, "Computer Science");
                Student s2 = new Student("Umurisa", 22, "002", 3.8, "Mathematics");


                Instructor inst = new Instructor("Dr. Alice", 40, 101, "Computer Science");

                Course course1 = new Course(1001, "Java Programming", 3, 2);

                 manager.registerStudent(s1);
                 manager.registerStudent(s2);

        manager.createCourse(course1);


        try {
            manager.enrollStudentInCourse(s1, course1);
            manager.enrollStudentInCourse(s2, course1);
        } catch (CourseFullException e) {
            System.out.println(e.getMessage());
        } catch (StudentAlreadyEnrolledException e) {
            System.out.println(e.getMessage());
        }

                System.out.println("Course: " + course1.getCourseName());
                for(Student s : course1.getStudents()) {
                    System.out.println("- " + s.getName() + " (" + s.getStidentID() + ")");
                }
    }
}