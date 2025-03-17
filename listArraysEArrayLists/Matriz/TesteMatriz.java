/* QUESTÃO 18: Escreva uma classe que encapsule uma matriz de tamanho 2 × 2 de valores do tipo float
usando um array de duas dimensões. Nesta classe, além do construtor, escreva um
método que calcule o determinante da matriz encapsulada e um método que permita a
impressão em formato matricial dos seus valores. Escreva um aplicativo de teste que
demonstre as capacidades da classe criada. */

package listArraysEArrayLists.Matriz;

public class TesteMatriz {
    public static void main(String[] args) {
        // Criando uma matriz 2x2
        Matriz matriz = new Matriz(3, 5, 2, 7);

        // Exibindo a matriz
        System.out.println("Matriz:");
        matriz.imprimirMatriz();

        // Calculando e exibindo o determinante
        float determinante = matriz.calcularDeterminante();
        System.out.println("\nDeterminante da Matriz: " + determinante);
    }
}
