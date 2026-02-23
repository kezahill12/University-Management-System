package universitymanagement;

import universitymanagement.model.*;

public class Main {
    public static void main(String[] args) {

                Student s1 = new Student("Keza", 21, "001", 3.5, "Computer Science");
                Student s2 = new Student("Hillary", 22, "002", 3.8, "Mathematics");


                Instructor inst = new Instructor("Dr. Alice", 40, 101, "Computer Science");

                Course course1 = new Course(1001, "Java Programming", 3, 2);

                course1.addStudent(s1);
                course1.addStudent(s2);

                System.out.println("Course: " + course1.getCourseName());
                for(Student s : course1.getStudents()) {
                    System.out.println("- " + s.getName() + " (" + s.getStidentID() + ")");
                }
    }
}