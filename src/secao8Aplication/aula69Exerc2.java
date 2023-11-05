package secao8Aplication;

import secao8Aplication.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class aula69Exerc2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee joao = new Employee();

        System.out.println("Name: ");
        joao.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        joao.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        joao.tax = sc.nextDouble();

        System.out.println("Employee: " + joao.name + "," + "$" + joao.netSalary());

        System.out.println("Which percentage to increase salary?");
        joao.increaseSalary(sc.nextDouble());

        System.out.println("Updated data: " + joao.name + ", $" + String.format("%.2f", joao.netSalary()));


        sc.close();
    }

}
