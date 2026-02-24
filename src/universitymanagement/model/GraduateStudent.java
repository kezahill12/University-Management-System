package universitymanagement.model;

public class GraduateStudent extends Student{

    private double researchFee;

    public GraduateStudent(String name, int age, String studentID, double GPA, String departement) {
        super(name, age, studentID, GPA, departement);

        this.researchFee=5000;
    }

    @Override
    public double calculateTuition(){
        return(10000*3) + researchFee;
    }


}
