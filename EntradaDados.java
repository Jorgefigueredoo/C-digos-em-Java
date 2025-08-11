import java.util.Scanner;


public class EntradaDados {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Informe o seu nome: ");
        String nome = sc.nextLine();
       
        System.out.println("Informe o seu sexo :");
        String sexo = sc.nextLine();
        
        System.out.println("Informe sua idade: ");
        double idade = sc.nextDouble();
        
        

        
        System.out.println("Informe seu nome: ");
        System.out.println("Inforeme sua idade:  ");
        System.out.println("Informe seu sexo:  ");
        
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu sexo é: " + sexo);

        sc.close();
    }
}
