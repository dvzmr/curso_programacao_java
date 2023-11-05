package secao8Aplication.entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public void finalStatus() {
        if (finalGrade() >= 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING " + String.format("%.2f",missingScore()) + " POINTS!");
        }
    }

    public double missingScore() {
        return 60 - finalGrade();
    }
}
