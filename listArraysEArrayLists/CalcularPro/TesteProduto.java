/* QUESTÃO 20:
Escreva um aplicativo que calcula o produto de uma série de inteiros que são passados
para um método produto utilizando uma lista de argumentos de comprimento variável.
Escreva também uma classe executável que teste seu método com várias chamadas,
cada uma com um número diferente de argumentos.*/

package listArraysEArrayLists.CalcularPro;

public class TesteProduto {
    public static void main(String[] args) {
        // Testando o método produto com diferentes quantidades de argumentos
        System.out.println("Produto de 2, 3: " + CalculadoraProduto.produto(2, 3));
        System.out.println("Produto de 4, 5, 6: " + CalculadoraProduto.produto(4, 5, 6));
        System.out.println("Produto de 1, 2, 3, 4, 5: " + CalculadoraProduto.produto(1, 2, 3, 4, 5));
        System.out.println("Produto de 7: " + CalculadoraProduto.produto(7));
        System.out.println("Produto sem argumentos: " + CalculadoraProduto.produto());
    }
}
