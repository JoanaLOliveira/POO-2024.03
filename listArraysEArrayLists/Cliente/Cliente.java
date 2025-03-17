/* QUESTÃO 19:
Crie um objeto de uma classe chamada Cliente com os atributos id, nome, idade, telefone.
Faça um programa para solicitar os dados de vários clientes e armazenar em um ArrayList
até que se digite um número de id negativo. Em seguida, exiba os dados de todos os
clientes.*/

package listArraysEArrayLists.Cliente;

public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private String telefone;

    // Construtor
    public Cliente(int id, String nome, int idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    // Método para exibir os dados do cliente
    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Idade: " + idade + " | Telefone: " + telefone;
    }
}
