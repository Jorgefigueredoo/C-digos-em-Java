package Composiçao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter departament's name: ");
        String departamentName = sc.nextLine();

        System.out.println("Enter worker data :");
        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
                new Departament(departamentName));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Contract #" + i + "data");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contratcDate = sdf.parse(sc.next());
            System.out.print("Value por hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Daration (hours): ");
            int hours = sc.nextInt();
            sc.nextLine();
            HourContratc contratc = new HourContratc(contratcDate, valuePerHour, hours);
            worker.addContract(contratc);
        }

        System.out.println();
        System.out.print("Enter moth year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
