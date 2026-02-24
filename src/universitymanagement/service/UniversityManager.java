
package universitymanagement.service;

import org.jetbrains.annotations.NotNull;
import universitymanagement.exception.CourseFullException;
import universitymanagement.exception.StudentAlreadyEnrolledException;
import universitymanagement.model.Student;
import universitymanagement.model.Course;


import java.util.ArrayList;
import java.util.List;

public class UniversityManager {
    private List<Student> students;
    private List<Course> courses;

    public UniversityManager() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void registerStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " has been registered.");
    }

    public void createCourse(Course course) {
        courses.add(course);
        System.out.println(course.getCourseName() + " has been created.");
    }

    public void enrollStudentInCourse(Student student, Course course)
            throws CourseFullException, StudentAlreadyEnrolledException {

        if(course.getStudents().contains(student)) {
            throw new StudentAlreadyEnrolledException(student.getName() + " is already enrolled!");
        }

        if(course.getStudents().size() >= course.getCapacity()) {
            throw new CourseFullException(course.getCourseName() + " is full!");
        }

        course.getStudents().add(student);
        System.out.println(student.getName() + " enrolled in " + course.getCourseName());

    }public void printDeansList(double minGPA) {
        System.out.println("Dean's List (GPA >= " + minGPA + "):");

        for (Student s : students) {
            if (s.calculateGPA() >= minGPA) {
                System.out.println("- " + s.getName() + " GPA: " + s.calculateGPA());
            }
        }

    }

}
