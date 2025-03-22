/* Escreva um programa que utilize uma pilha para verificar se uma String de entrada formada apenas por ’(’ e ’)’ está balanceada.
É proibido utilizar contador(es) na solução desta questão.
Os parênteses estão balanceados quando, na expressão, para cada abre parênteses há
um correspondente fecha parênteses e os pares de parênteses estão aninhados.
Exemplos de Strings de parênteses corretamente balanceadas:
(()()()())
(((())))
(()((())()))
Exemplos de Strings de parênteses não são balanceadas:
((((((())
()))
(()()(() */

package listColeçõesGenéricas.Balanceadas;

import java.util.Stack;

public class VerificadorDeBalanceamento {
    public static boolean estaBalanceado(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (char c : expressao.toCharArray()) {
            if (c == '(') {
                pilha.push(c); // Empilha parêntese de abertura
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false; // Há um ')' sem um '(' correspondente
                }
                pilha.pop(); // Desempilha um '(' correspondente
            }
        }

        return pilha.isEmpty(); // Se a pilha estiver vazia, está balanceado
    }

    public static void main(String[] args) {
        String[] testes = {
            "(()()()())",   // Balanceado
            "(((())))",     // Balanceado
            "(()((())()))", // Balanceado
            "((((((())",    // Não balanceado
            "())",          // Não balanceado
            "(()()(()"      // Não balanceado
        };

        for (String teste : testes) {
            System.out.println("Expressão: " + teste + " → " + (estaBalanceado(teste) ? "Balanceado" : "Não Balanceado"));
        }
    }
}
