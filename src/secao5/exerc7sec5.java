package secao5;

import java.util.Scanner;

public class exerc7sec5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float x, y;

        System.out.println("Digite o Valor de X!");
        x = sc.nextFloat();
        System.out.println("Digite o Valor de Y!");
        y = sc.nextFloat();

        if (x == 0 || y == 0) {
            System.out.println("Origem");
        }
        if (x == 0) {
            System.out.println("Eixo X");
        }
        if (y == 0) {
            System.out.println("Eixo Y");
        }
        if (x > 0 & y > 0) {
            System.out.println("Q1");
        } else if (x > 0 & y < 0) {
            System.out.println("Q4");

        } else if (x < 0 & y > 0) {
            System.out.println("Q2");
        } else if (x < 0 & y < 0) {
            System.out.println("Q3");
        }
        sc.close();
    }
}
