package secao5;

import java.util.Scanner;

public class exerc1sec5 {

    public static void main(String[] args) {

        int a;
        System.out.println("Digite o numero que vai ser verificado: ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();

        if (a < 0)

            System.out.println("Negativo");

        else

            System.out.println("Não Negativo");
    }

}
