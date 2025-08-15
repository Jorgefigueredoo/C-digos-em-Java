package EstruturaRepetição;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Lê a quantidade de pares

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b == 0) {
                System.out.println("divisao impossivel");
            } else {
                double resultado = (double) a / b;
                System.out.println(resultado);
            }
        }

        sc.close();
    }
}
