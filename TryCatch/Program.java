package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        method1();

        System.out.println("End of program");

    }

    public static void method1() {
        System.out.println("***METHOD1 STRAT***");
        method2();
        System.out.println("***METHOD1 END***");

    }

    public static void method2() {
        System.out.println("***METHOD@ START");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida!");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Erro do input!");
        }
        sc.close();
        System.out.println("***METHOD2 END***");
    }
}
