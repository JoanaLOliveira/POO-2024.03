/* Escreva um programa que cria um objeto LinkedList de 10 caracteres e, então, cria um
segundo objeto LinkedList contendo uma cópia da primeira lista, mas na ordem inversa.
Não devem ser utilizados métodos da Java API para realizar a inversão. */

package listColeçõesGenéricas.LinkedList;

import java.util.LinkedList;

public class InverterLinkedList {
    public static void main(String[] args) {
        // Criando uma LinkedList original com 10 caracteres
        LinkedList<Character> listaOriginal = new LinkedList<>();
        listaOriginal.add('A');
        listaOriginal.add('B');
        listaOriginal.add('C');
        listaOriginal.add('D');
        listaOriginal.add('E');
        listaOriginal.add('F');
        listaOriginal.add('G');
        listaOriginal.add('H');
        listaOriginal.add('I');
        listaOriginal.add('J');

        // Criando uma nova LinkedList para armazenar os elementos invertidos
        LinkedList<Character> listaInvertida = new LinkedList<>();

        // Percorrendo a lista original e adicionando no início da nova lista
        for (char elemento : listaOriginal) {
            listaInvertida.addFirst(elemento); // Insere sempre no início
        }

        // Exibindo as listas
        System.out.println("Lista Original:   " + listaOriginal);
        System.out.println("Lista Invertida:  " + listaInvertida);
    }
}
