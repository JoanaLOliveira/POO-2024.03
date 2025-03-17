/* QUESTÃO 20:
Escreva um aplicativo que calcula o produto de uma série de inteiros que são passados
para um método produto utilizando uma lista de argumentos de comprimento variável.
Escreva também uma classe executável que teste seu método com várias chamadas,
cada uma com um número diferente de argumentos.*/

package listArraysEArrayLists.CalcularPro;

public class CalculadoraProduto {
    // Método que calcula o produto de uma quantidade variável de inteiros
    public static int produto(int... numeros) {
        int resultado = 1;
        for (int num : numeros) {
            resultado *= num;
        }
        return resultado;
    }
}
