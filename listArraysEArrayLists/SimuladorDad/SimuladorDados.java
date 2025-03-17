/* QUESTÃO 21:
Escreva um aplicativo para simular o lançamento de dois dados. O aplicativo deve utilizar
um objeto de classe Random, uma vez para lançar o primeiro dado e novamente para
lançar o segundo dado. A soma dos dois valores deve então ser calculada. Cada dado
pode mostrar um valor inteiro de 1 a 6, portanto a soma dos valores irá variar de 2 a 
12, com 7 sendo a soma mais frequente e 2 e 12, as somas menos frequentes. Seu
aplicativo deve lançar o dado 36.000.000 vezes. Utilize um array unidimensional para
contar o número de vezes que cada possível soma aparece. Exiba os resultados. */


package listArraysEArrayLists.SimuladorDad;

import java.util.Random;

public class SimuladorDados {
    public static void main(String[] args) {
        Random random = new Random();
        int totalLancamentos = 36_000_000;

        // Array para armazenar a contagem das somas (índices de 2 a 12)
        int[] contagemSomas = new int[13];

        // Simulação dos lançamentos dos dados
        for (int i = 0; i < totalLancamentos; i++) {
            int dado1 = random.nextInt(6) + 1; // Gera um número entre 1 e 6
            int dado2 = random.nextInt(6) + 1; // Gera um número entre 1 e 6
            int soma = dado1 + dado2; // Soma dos valores dos dois dados

            contagemSomas[soma]++; // Incrementa a contagem para essa soma
        }

        // Exibindo os resultados
        System.out.println("Soma\tFrequência\tPorcentagem");
        for (int soma = 2; soma <= 12; soma++) {
            double porcentagem = (contagemSomas[soma] / (double) totalLancamentos) * 100;
            System.out.printf("%d\t%,d\t\t%.2f%%\n", soma, contagemSomas[soma], porcentagem);
        }
    }
}
