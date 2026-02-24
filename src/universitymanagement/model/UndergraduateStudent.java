package universitymanagement.model;

public class UndergraduateStudent extends Student {

    public UndergraduateStudent(String name, int age, String studentID, double GPA, String departement) {
        super(name, age, studentID, GPA, departement);
    }
    @Override
    public double calculateTuition() {
        return 10000;
    }

}
