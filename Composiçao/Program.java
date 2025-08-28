package Composiçao;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter departament's name: ");
        String departamentName = sc.nextLine();

        System.out.println("Enter worker data :");
        System.out.println("Name: ");
        String workerName = sc.nextLine();

        System.out.println("Level: ");
        String workerLevel = sc.nextLine();

        System.out.println("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOF(workerLevel), baseSalary,
                new Departament(departamentName));

        sc.close();
    }
}
