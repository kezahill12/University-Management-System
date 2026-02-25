package universitymanagement.model;

public class GraduateStudent extends Student{

    private double researchFee;

    public GraduateStudent(String name, int age, String studentID, double GPA, String departement ,double researchFee) {
        super(name, age, studentID, GPA, departement);

        this.researchFee=researchFee;
    }

    public double getResearchFee() {
        return researchFee;
    }

    public void setResearchFee(double researchFee) {
        this.researchFee = researchFee;
    }

    @Override
    public double calculateTuition(){
        return(10000*3) + researchFee;
    }


}
