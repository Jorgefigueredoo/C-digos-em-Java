package Classes.Estoque;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Price: ");
        double price = sc.nextDouble();

        System.out.println("Quantity in Stock");
        int quantity = sc.nextInt();

        Produto produto = new Produto(name, price, quantity);
        
        System.out.println();
        System.out.println("Produtodo Data: " + produto);

        System.out.println();
        System.out.printf("Enter the number of products to be added in stock ");
        quantity = sc.nextInt();
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
