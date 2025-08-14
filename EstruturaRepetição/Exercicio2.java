package EstruturaRepetição;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int TipoCombustivel;

        System.out.println("1 - Álcool");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel");
        System.out.println("4 - Fim");

        System.out.println("Digite um numero de 1 - 4 para dizer qual o melhor combustivél");
        TipoCombustivel = sc.nextInt();

        while (TipoCombustivel < 1 ||  TipoCombustivel > 4) {
            System.out.println("Escreva um numero de 1 a 4: ");
            TipoCombustivel = sc.nextInt();
        }

        System.out.println("Muito Obrigado !!!");

        sc.close();

    }
}
