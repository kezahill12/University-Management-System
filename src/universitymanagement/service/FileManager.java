package universitymanagement.service;

import universitymanagement.model.Student;
import universitymanagement.model.Course;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileManager {

    public static void saveStudents(List<Student> students) {
        try {
            FileWriter writer = new FileWriter("students.txt");

            for (Student s : students) {
                writer.write(s.getName() + "," + s.getStudentID() + "," + s.getGPA() + "," + s.getdepartment() + "\n");
            }

            writer.close();
            System.out.println("Students saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving students.");
        }
    }

    public static void saveCourses(List<Course> courses) {
        try {
            FileWriter writer = new FileWriter("courses.txt");

            for (Course c : courses) {
                writer.write(c.getCourseName() + "," + c.getCourseID() + "," + c.getCredits() + "," + c.getCapacity() + "\n");
            }

            writer.close();
            System.out.println("Courses saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving courses.");
        }
    }
}