package secao5;

import java.util.Scanner;

public class exerc2sec5 {

    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero que vai ser verificado:");

        num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("PAR");


        else System.out.println("IMPAR");
    }
}

