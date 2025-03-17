/* QUESTÃO 31: 
Crie uma classe Pessoa com ao menos 2 atributos a sua escolha. Escreva a classe
Politico que herda da classe Pessoa e tem um campo adicional para representar o partido
do político. Escreva também as classes Prefeito e Governador que herdam da classe
Politico e que contém campos para representar a cidade ou estado governado. Todos
atributos devem ser privados. Cada classe deve ter um construtor e um método toString.
Lembre-se que cada método toString deve representar todos os atributos, inclusive os
herdados. Escreva também uma aplicação que demonstre o uso de instâncias destas
classes. */

package listReusoDeClasses.Politico;

public class TestePoliticos {
    public static void main(String[] args) {
        // Criando um político genérico
        Politico politico = new Politico("Carlos Silva", 50, "Partido XYZ");

        // Criando um prefeito
        Prefeito prefeito = new Prefeito("Ana Souza", 45, "Partido ABC", "São Paulo");

        // Criando um governador
        Governador governador = new Governador("Marcos Lima", 52, "Partido DEF", "Rio de Janeiro");

        // Exibindo informações
        System.out.println("Dados do Político:");
        System.out.println(politico);

        System.out.println("\nDados do Prefeito:");
        System.out.println(prefeito);

        System.out.println("\nDados do Governador:");
        System.out.println(governador);
    }
}
