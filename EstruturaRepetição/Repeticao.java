package EstruturaRepetição;

import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        int soma = 0;

        System.out.println("Informe um numero: ");
        x = sc.nextInt();

        while (x != 0) {
            soma = soma + x;
            System.out.println("Numero errado, tente novamente !!!");
            x = sc.nextInt();
            
        }

        System.out.println(soma);
        
        sc.close();
    }
}