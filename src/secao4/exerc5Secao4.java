package secao4;

import java.util.Locale;
import java.util.Scanner;

public class exerc5Secao4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int cdgPca1, qntPca1, cdgPca2, qntPca2;
        double precoPca1, precoPca2, valorTotal;

        Scanner sc = new Scanner(System.in);

        cdgPca1= sc.nextInt();
        qntPca1= sc.nextInt();
        precoPca1= sc.nextDouble();
        cdgPca2= sc.nextInt();
        qntPca2= sc.nextInt();
        precoPca2= sc.nextDouble();

        valorTotal= (qntPca1*precoPca1) + (qntPca2*precoPca2);

        System.out.printf("Valor a pagar: R$%.2f",valorTotal);


    }

}
