package secao4;

import java.util.Locale;
import java.util.Scanner;

public class exerc3Secao4 {

    public static void main(String[] args) {

        int a, b, c, d, x, y, z;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        x = a * b;
        y = c * d;
        z = x - y;


        System.out.println("Diferença: " + z);
    }

}
