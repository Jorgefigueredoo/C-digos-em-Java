package Classes.Salario;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Salario sal = new Salario();

        System.out.println("Nome: ");
        sal.nome = sc.nextLine();

        System.out.println("Salário Bruto: ");
        sal.SalarioBruto = sc.nextDouble();

        System.out.println("Taxa: ");
        sal.taxa = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionário" + sal);

        System.out.println();
        System.out.println("Informe a porcentagem para aumento");
        double porcentagem = sc.nextDouble();
        sal.AcresentarSalario(porcentagem);

        System.out.println();
        System.out.println("Dados atualizados: " + sal);

        sc.close();
    }
}
