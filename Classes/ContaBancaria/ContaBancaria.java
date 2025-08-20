package Classes.ContaBancaria;

public class ContaBancaria {

    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }


    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }


    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }


    public void setTitular(String titular) {
        this.titular = titular;
    }


    public double getSaldo() {
        return saldo;
    }


    public void deposito(double quantia) {
        saldo += quantia;
    }

    public void retirar(double quantia) {
        saldo -= quantia + 5;
    }

    public String toString() {
        return "Conta"
            + numero
            + ", titular "
            + titular
            + ", saldo: $ "
            + String.format("%.2f", saldo);
    }











} 