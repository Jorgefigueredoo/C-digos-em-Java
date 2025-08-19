package Classes.Salario;

public class Salario {
    
    public String nome;
    public double SalarioBruto;
    public double taxa;
    

    public double SalarioLiquido() {
        return SalarioBruto - taxa;
    }

    public void AcresentarSalario(double porcentagem) {
        SalarioBruto += SalarioBruto * porcentagem / 100;
    }

    public String toString() {
        return nome + " , $ " + String.format("%2f ", SalarioLiquido());
    }

}
