package Classes.Retangulo;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Retangulo ret = new Retangulo();

        System.out.println("Informe a altura do retângulo: ");
        ret.altura = sc.nextDouble();

        System.out.println("Informe a largura do retângulo: ");
        ret.largura = sc.nextDouble();

        System.out.println("A área do retângulo é: " + ret.area());

        System.out.println("O perimetro do retângulo é: " + ret.perimetro());

        System.out.println("A diagonal do retângulo é : " + ret.diagonal());

        sc.close();
    }
}
