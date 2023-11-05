package secao8Aplication;

import secao8Aplication.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class aula69Exerc1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rect1 = new Rectangle();

        System.out.println("Enter rectangle width: ");
        rect1.width = sc.nextDouble();
        System.out.println("Enter rectangle height: ");
        rect1.height = sc.nextDouble();

        System.out.println("Area = "+ rect1.area());
        System.out.println("Perimeter = "+ rect1.perimeter());
        System.out.println("Area = "+ rect1.diagonal());


        sc.close();
    }
}
