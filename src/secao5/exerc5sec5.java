package secao5;

import java.util.Scanner;

public class exerc5sec5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double total = 0;

        if (codigo == 1) {
            total = quantidade * 4.0;
        }
        if (codigo == 2) {
            total = quantidade * 4.5;
        }
        if (codigo == 3) {
            total = quantidade * 5.0;
        }
        if (codigo == 4) {
            total = quantidade * 2.0;
        }
        if (codigo == 5) {
            total = quantidade * 1.5;
        }

        System.out.println("Total: R$" + total);

    }

}
