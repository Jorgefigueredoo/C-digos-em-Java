package Classes.ContaBancaria;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaBancaria contaBancaria;

        System.out.print("Informe o numero da sua conta: ");
        int number = sc.nextInt();

        System.out.print("Informe o titular: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Existe um deposito incial? (y/n)");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.print("insira um valor de depósito inicial: ");
            double initialDeposit = sc.nextDouble();
            contaBancaria = new ContaBancaria(number, holder, initialDeposit);
        }

        else {
            contaBancaria = new ContaBancaria(number, holder);
        }

        System.out.println();
        System.out.println("Conta atualizada");
        System.out.println(contaBancaria);

        System.out.println();
        System.out.println("Informe um valor para depósito: ");
        double depositoValue = sc.nextDouble();
        contaBancaria.deposito(depositoValue);
        System.out.println("Conta atualizada:");
        System.out.println(contaBancaria);

        System.out.println();
        System.out.println("Informe um valor para saque: ");
        double saqueValue = sc.nextDouble();
        contaBancaria.retirar(saqueValue);
        System.out.println("Conta atualizada:");
        System.out.println(contaBancaria);
        sc.close();
    }
}
