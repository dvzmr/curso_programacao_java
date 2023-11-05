package secao5;

import java.util.Scanner;

public class exerc3sec5 {

    public static void main(String[] args) {

        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros em ordem crescente:");

        a = sc.nextInt();
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {

            System.out.println("São multiplos");
        } else {
            System.out.println("Não sao multiplos");

        }


        sc.close();
    }
}
