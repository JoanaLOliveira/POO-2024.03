/* QUESTÃO 19:
Crie um objeto de uma classe chamada Cliente com os atributos id, nome, idade, telefone.
Faça um programa para solicitar os dados de vários clientes e armazenar em um ArrayList
até que se digite um número de id negativo. Em seguida, exiba os dados de todos os
clientes.*/

package listArraysEArrayLists.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroClientes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        while (true) {
            System.out.print("Digite o ID do cliente (ou um número negativo para sair): ");
            int id = scanner.nextInt();
            if (id < 0) break;

            scanner.nextLine(); // Limpa o buffer do teclado

            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade do cliente: ");
            int idade = scanner.nextInt();

            scanner.nextLine(); // Limpa o buffer do teclado

            System.out.print("Digite o telefone do cliente: ");
            String telefone = scanner.nextLine();

            // Criando e adicionando o cliente à lista
            clientes.add(new Cliente(id, nome, idade, telefone));
        }

        // Exibindo os clientes cadastrados
        System.out.println("\nClientes cadastrados:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        scanner.close();
    }
}
