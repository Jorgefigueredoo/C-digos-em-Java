package Classes.Carro;

public class Herança {
    public static void main(String[] args) {
    
    
    Carro carro1 = new Carro();

    carro1.marca = "Toyota";
    carro1.ano = 2022;
    carro1.portas = 4;
    carro1.modelo = "Corolla";


    carro1.Buzinar();
    carro1.exibir_informaçoes();

}
}
