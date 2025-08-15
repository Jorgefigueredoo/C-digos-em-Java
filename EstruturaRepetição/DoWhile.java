package EstruturaRepetição;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp;

        do {
            System.out.print("Informe a temperatura em Celsius: ");
            double c = sc.nextDouble();

            double f = 9.0 * c / 5.0 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", f);

            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);

        } while (resp != 'n'); 

        sc.close();
    }
}
