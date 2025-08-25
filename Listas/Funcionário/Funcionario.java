package Listas.Funcionário;

public class Funcionario {

    private Integer id;
    private String nome;
    private Double salario;

    // Construtor para inicializar os dados do funcionário
    public Funcionario(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    // Métodos Getters para permitir o acesso (leitura) aos dados
    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    // Método específico para aumentar o salário com base em uma porcentagem
    public void aumentarSalario(double porcentagem) {
        salario += salario * porcentagem / 100.0;
    }

    // Sobrescreve o método toString() para formatar a saída de dados do objeto
    @Override
    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }
}
