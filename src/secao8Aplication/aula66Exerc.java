package secao8Aplication;

import secao8Aplication.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class aula66Exerc {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("Product Data: " + product);

        System.out.print("Enter the number of products to be ADDED in stock:");
        int quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println("Updated Data: " + product);

        System.out.print("Enter the number of products to be REMOVED in stock:");
        quantity = sc.nextInt();
        product.removeProduct(quantity);

        System.out.println("Updated Data: " + product);

        sc.close();
    }

}
