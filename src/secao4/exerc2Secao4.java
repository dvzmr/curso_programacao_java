package secao4;

import java.util.Locale;
import java.util.Scanner;

public class exerc2Secao4 {

    public static void main(String[] args) {

        double r ;
        double pi = 3.14159;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        r = sc.nextDouble();


        double area = Math.pow(r,2)*pi;

        System.out.printf("Área do Circulo= %.4f", area);


    }
}
