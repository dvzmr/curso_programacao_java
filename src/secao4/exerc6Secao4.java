package secao4;

import java.util.Locale;
import java.util.Scanner;

public class exerc6Secao4 {

    public static void main(String[] args) {

        double a,b,c,aTriang,aCirc,aTrap,aQuad,aRet;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        a= sc.nextDouble();
        b= sc.nextDouble();
        c= sc.nextDouble();

        aTriang = (a*c) / 2 ;
        aCirc = Math.pow(c,2) * 3.14159;
        aTrap = ((a+b)*c) / 2;
        aQuad = Math.pow(b,2);
        aRet  = a*b;

        System.out.printf("Triangulo: %.3f",aTriang);
        System.out.printf("\nCirculo: %.3f",aCirc);
        System.out.printf("\nTrapezio: %.3f",aTrap);
        System.out.printf("\nQuadrado: %.3f",aQuad);
        System.out.printf("\nRetangulo: %.3f",aRet);






    }

}
