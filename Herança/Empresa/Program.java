package Herança.Empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employe> list = new ArrayList<>();

        System.out.print("Enter the number of Employes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Employee# " + i + " data: ");
            System.out.print("Outsourced (y/n)?");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("AddtionlCharge: ");
                double addtionlCharge = sc.nextDouble();
                Employe emp = new OutsourcedEmployee(name, hours, valuePerHour, addtionlCharge);
                list.add(emp);
            } else {
                Employe emp = new Employe(name, hours, valuePerHour);
                list.add(emp);
            }
        }
        System.out.println();
        System.out.println("Payments:");
        for (Employe emp : list) {
            System.out.println(emp.getName() + "- $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
