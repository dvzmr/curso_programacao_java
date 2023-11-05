package secao5;

import java.util.Scanner;

public class exerc6sec5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número! ");

        float num = sc.nextFloat();

        if (num < 0 || num > 100) {
            System.out.println("Fora do Intervalo");
        } else if (num <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (num <= 50) {
            System.out.println("Intervalo [25,50]");
        } else if (num <= 75) {
            System.out.println("Intervalo [50,75]");
        } else if (num <= 100) {
            System.out.println("Intervalo [75,100]");
        }
        sc.close();
    }
}
