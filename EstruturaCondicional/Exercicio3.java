import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos;
        double valorTotal = 50;
        
        
        
        System.out.println("Quantos minutos consumidos? ");
        minutos = sc.nextInt();


        if (minutos <= 100){
        System.out.println(valorTotal);
        }

        else {
            System.out.println((minutos - 100) * 2 + valorTotal);
        }


        sc.close();














    }
}
