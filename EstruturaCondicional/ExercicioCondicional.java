import java.util.Scanner;

public class ExercicioCondicional {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double numero;

        System.out.println("Informe um numero: ");
        numero = sc.nextDouble();


        if (numero < 0){

        System.out.println("Negativo");
        }
        
        else if (numero > 0){

        System.out.println("Positivo");
        }
        
        
        sc.close(); 
   
    }

}
