package secao8Aplication;

import secao8Aplication.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class aula69Exerc3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student alex = new Student();

        alex.name = sc.nextLine();
        alex.grade1 = sc.nextDouble();
        alex.grade2 = sc.nextDouble();
        alex.grade3 = sc.nextDouble();

        System.out.println("FINAL GRADE= "+ String.format("%.2f",alex.finalGrade()));
        alex.finalStatus();

    }
}
