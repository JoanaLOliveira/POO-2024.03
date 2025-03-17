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

public class Politico extends Pessoa {
    private String partido;

    // Construtor
    public Politico(String nome, int idade, String partido) {
        super(nome, idade); // Chama o construtor da superclasse
        this.partido = partido;
    }

    // Getters e Setters
    public String getPartido() { return partido; }
    public void setPartido(String partido) { this.partido = partido; }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + " | Partido: " + partido;
    }
}
