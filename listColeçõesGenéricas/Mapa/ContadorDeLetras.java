/* Escreva um programa que utilize a estrutura de dados do tipo Mapa para contar o número
de ocorrências de cada letra em uma String. Por exemplo, a string "HELLO THERE"
contém dois H’s, três E’s, dois L’s, um O , um T e um R. Exiba os resultados em ordem
alfabética.
• Serão totalmente desconsideradas respostas que não utilizarem um Mapa como
elemento principal da estratégia de solução desta questão. */

package listColeçõesGenéricas.Mapa;

import java.util.Map;
import java.util.TreeMap;

public class ContadorDeLetras {
     public static void main(String[] args) {
        String texto = "HELLO THERE";

        // Criando um TreeMap para armazenar a contagem das letras (mantém ordem alfabética)
        Map<Character, Integer> contagemLetras = new TreeMap<>();

        // Percorrendo cada caractere da string
        for (char c : texto.toUpperCase().toCharArray()) {
            if (Character.isLetter(c)) { // Ignora espaços e caracteres não alfabéticos
                contagemLetras.put(c, contagemLetras.getOrDefault(c, 0) + 1);
            }
        }

        // Exibindo a contagem das letras em ordem alfabética
        System.out.println("Contagem de letras:");
        for (Map.Entry<Character, Integer> entry : contagemLetras.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
