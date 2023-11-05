package secao8Aplication.entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;


    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double increaseRate) {
        grossSalary = grossSalary * (1 + (increaseRate / 100));
    }

}
