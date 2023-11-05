package secao4;

import java.util.Locale;
import java.util.Scanner;

public class exerc4Secao4 {

    public static void main(String[] args) {

        int numFunc, hrTrab;
        double valorHr, salario;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do funcionário. ");
            numFunc = sc.nextInt();
        System.out.println("Digite a quantidade horas trabalhadas do funcionário. ");
            hrTrab = sc.nextInt();
        System.out.println("Digite quanto por hora ele recebe. ");
            valorHr = sc.nextDouble();

            salario = hrTrab*valorHr;

        System.out.printf("Numero= "+numFunc);
        System.out.printf("\nSalário= U$ %.2f",salario);
    }
}
