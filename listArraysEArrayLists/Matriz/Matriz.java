/* QUESTÃO 18: Escreva uma classe que encapsule uma matriz de tamanho 2 × 2 de valores do tipo float
usando um array de duas dimensões. Nesta classe, além do construtor, escreva um
método que calcule o determinante da matriz encapsulada e um método que permita a
impressão em formato matricial dos seus valores. Escreva um aplicativo de teste que
demonstre as capacidades da classe criada. */

package listArraysEArrayLists.Matriz;

public class Matriz {
    private float[][] matriz;

    // Construtor que recebe os valores da matriz
    public Matriz(float a, float b, float c, float d) {
        matriz = new float[2][2]; 
        matriz[0][0] = a; matriz[0][1] = b;
        matriz[1][0] = c; matriz[1][1] = d;
    }

    // Método para calcular o determinante
    public float calcularDeterminante() {
        return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
    }

    // Método para imprimir a matriz em formato matricial
    public void imprimirMatriz() {
        System.out.println("[ " + matriz[0][0] + "  " + matriz[0][1] + " ]");
        System.out.println("[ " + matriz[1][0] + "  " + matriz[1][1] + " ]");
    }
}
