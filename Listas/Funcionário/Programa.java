package Listas.Funcionário;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Optional;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Para garantir que o separador decimal seja o ponto '.'
        Scanner sc = new Scanner(System.in);

        List<Funcionario> listaFuncionarios = new ArrayList<>();

        // --- PARTE 1: REGISTRO DOS FUNCIONÁRIOS ---
        System.out.print("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nFuncionário #" + i + ":");

            System.out.print("Id: ");
            int id = sc.nextInt();

            // Validação para não permitir IDs repetidos
            while (idExiste(listaFuncionarios, id)) {
                System.out.print("Id já cadastrado. Digite outro: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine(); // Limpeza de buffer antes de ler o nome
            String nome = sc.nextLine();

            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            listaFuncionarios.add(new Funcionario(id, nome, salario));
        }

        // --- PARTE 2: APLICAÇÃO DO AUMENTO ---
        System.out.println();
        System.out.print("Digite o Id do funcionário que receberá o aumento: ");
        int idAumento = sc.nextInt();

        // Encontra o funcionário na lista de forma eficiente com Stream API
        Optional<Funcionario> funcionarioParaAumento = listaFuncionarios.stream()
                .filter(f -> f.getId().equals(idAumento))
                .findFirst();

        if (funcionarioParaAumento.isPresent()) {
            System.out.print("Digite a porcentagem de aumento: ");
            double porcentagem = sc.nextDouble();
            funcionarioParaAumento.get().aumentarSalario(porcentagem);
        } else {
            System.out.println("Este id não existe!");
        }

        // --- PARTE 3: EXIBIÇÃO DA LISTA FINAL ---
        System.out.println("\nLista de funcionários atualizada:");
        for (Funcionario func : listaFuncionarios) {
            System.out.println(func);
        }

        sc.close();
    }

    /**
     * Função auxiliar para verificar se um ID já existe na lista.
     * 
     * @param lista A lista onde a verificação será feita.
     * @param id    O id a ser procurado.
     * @return true se o id for encontrado, false caso contrário.
     */
    public static boolean idExiste(List<Funcionario> lista, int id) {
        return lista.stream().anyMatch(f -> f.getId().equals(id));
    }
}