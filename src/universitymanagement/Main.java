package universitymanagement;

import  universitymanagement.exception.CourseFullException;
import universitymanagement.exception.StudentAlreadyEnrolledException;
import universitymanagement.service.FileManager;
import universitymanagement.service.UniversityManager;
import universitymanagement.model.*;

public class Main {
    public static void main(String[] args) {

        UniversityManager manager = new UniversityManager();

                Student s1 = new  UndergraduateStudent("Kamanzi", 21, "001", 3.5, "Computer Science");
                Student s2 = new  GraduateStudent("Umurisa", 22, "002", 3.8, "Mathematics",5000);


                Instructor inst = new Instructor("Dr. Alice", 40, 101, "Computer Science");

                Course course1 = new Course(1001, "Java Programming", 3, 2);

                 manager.registerStudent(s1);
                 manager.registerStudent(s2);

        System.out.println();

        System.out.println("=== Create Course ===");
                 manager.createCourse(course1);

        System.out.println();

        System.out.println("=== Enroll Students ===");

        try {
            manager.enrollStudentInCourse(s1, course1);
            manager.enrollStudentInCourse(s2, course1);
            System.out.println();

        } catch (CourseFullException | StudentAlreadyEnrolledException e) {
            System.out.println(e.getMessage());
        }

        s1.addCourse(course1, 60);
        s2.addCourse(course1, 90);

        System.out.println("Course: " + course1.getCourseName());
        System.out.println();

        System.out.println("=== Student  ===");
                for(Student s : course1.getStudents()) {
                    System.out.println("- " + s.getName() + " (ID: " + s.getStudentID() + ")");
                }

        System.out.println();
        s1.printCourses();
        s2.printCourses();

        System.out.println("=== Dean's List ===");
        manager.printDeansList(70);

        System.out.println();
        FileManager.saveStudents(manager.getStudents());
        FileManager.saveCourses(manager.getCourses());



        System.out.println();
        System.out.println("=== End ===");
    }
}