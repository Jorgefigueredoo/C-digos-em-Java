import java.util.Scanner;


public class EntradaDados {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.nextLine();
       
        double num;
        num = sc.nextDouble();
        
        
        System.out.println("Informe um numero: " + num);
        System.out.println("Você digitou : " + x);

        sc.close();
    }
}
