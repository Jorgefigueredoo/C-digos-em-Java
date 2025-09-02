package Composiçao.Contratos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Departament departament;
    private List<HourContratc> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public List<HourContratc> geContratcs() {
        return contracts;
    }

    public void addContract(HourContratc contratc) {
        contracts.add(contratc);
    }

    public void removeContract(HourContratc contratc) {
        contracts.remove(contratc);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContratc c : contracts) {
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }

        }
        return sum;
    }

    public Departament getDepartment() {
        return this.departament; // ou simplesmente "return departament;"
    }

    public String getName() {
        return this.name; // ou simplesmente "return name;"
    }

}