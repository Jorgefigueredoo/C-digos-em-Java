package Composiçao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter departament's name: ");
        String departamentName = sc.nextLine();

        System.out.println("Enter worker data :");
        System.out.println("Name: ");
        String workerName = sc.nextLine();

        System.out.println("Level: ");
        String workerLevel = sc.nextLine();

        System.out.println("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
                new Departament(departamentName));

        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.println("Enter Contract #" + i + "data");
            System.out.println("Date (DD/MM/YYYY)");
            Date contratcDate = sdf.parse(sc.next());
            System.out.println("Value por hour: ");
            double valuePerHour = sc.nextDouble();
            int hours = sc.nextInt();
            HourContratc contratc = new HourContratc(contratcDate, valuePerHour, hours);
            worker.addContract(contratc);
        }

        sc.close();
    }
}
