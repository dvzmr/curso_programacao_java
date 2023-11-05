package secao5;

import java.util.Scanner;

public class exerc8sec5 {

    public static void main(String[] args) {

        double salario, imposto, valor1, valor2, valor3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do seu Salário: ");
        salario = sc.nextDouble();


        if (salario <= 2000) {
            imposto = 0;

            System.out.printf("imposto a pagar R$ %.2f%n ", imposto);
        } else if (salario <= 3000) {
            valor1 = salario - 2000;
            imposto = valor1 * 0.08;
            System.out.printf("imposto a pagar R$ %.2f%n ", imposto);
        } else if (salario <= 4500) {
            valor2 = salario - 3000;
            imposto = 1000 * 0.08 + valor2 * 0.18;
            System.out.printf("imposto a pagar R$ %.2f%n ", imposto);
        } else if (salario > 4500) {
            valor3 = salario - 4500;
            imposto = 1000 * 0.08 + 1500 * 0.18 + valor3 * 0.28;
            System.out.printf("imposto a pagar R$ %.2f%n ", imposto);

        }
        sc.close();


    }
}
