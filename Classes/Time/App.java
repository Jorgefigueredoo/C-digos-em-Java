package Classes.Time;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe o seu time: ");
        String time = sc.nextLine();

        System.out.printf("Informe quantos Pernambucanos ele tem: ");
        int titulos = sc.nextInt();

        Pernambucano pe = new Pernambucano(time, titulos);

        System.out.println("Seu time é: " + pe.getTime());
        System.out.println("E ele tem: " + pe.getTitulos() + " Pernambucanos");

    }
}
