package Estoque;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        produto.name = sc.nextLine();

        System.out.println("Price: ");
        produto.price = sc.nextDouble();

        System.out.println("Quantity in Stock");
        produto.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Produtodo Data: " + produto);

        System.out.println();
        System.out.printf("Enter the number of products to be added in stock ");
        int quantity = sc.nextInt();
        produto.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data :" + produto);

        System.out.println();
        System.out.println("Enter the number of products to be removed form stock");
        quantity = sc.nextInt();
        produto.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + produto);
        
        
        sc.close();
    }
}
