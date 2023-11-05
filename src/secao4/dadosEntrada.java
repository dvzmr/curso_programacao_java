package secao4;

import java.util.Scanner;

public class dadosEntrada {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        String x,k;
        double y;
        char z;




        x = sc.next();
        y = sc.nextDouble();
        z = sc.next().charAt(0);
        sc.nextLine();
        k = sc.nextLine();

        System.out.println("O "+ x +" tem "+ y+" anos, cuja a inicial do nome é:"+z+", "+k);


        sc.close();
    }

    }