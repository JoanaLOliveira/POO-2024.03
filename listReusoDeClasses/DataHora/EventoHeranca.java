/* QUESTÃO 29:
Crie uma classe para representar uma data e um horário (DataHora).
• Escreva uma classe EventoDelegacao que seja baseada na classe DataHora e que
contenha um campo para indicar qual o evento que ela representa (use uma String
para isto). Use o mecanismo de delegação para criar a classe EventoDelegacao;
• Escreva uma classe EventoHeranca que seja baseada na classe DataHora e que
contenha um campo para indicar qual o evento que ela representa (use uma String
para isto). Use o mecanismo de herança para criar a classe EventoHeranca;
• Escreva um aplicativo de teste que demonstre o uso das classes criadas. */

package listReusoDeClasses.DataHora;

public class EventoHeranca extends DataHora{
    private String evento;

    // Construtor que chama o construtor da classe base
    public EventoHeranca(String evento, int dia, int mes, int ano, int hora, int minuto) {
        super(dia, mes, ano, hora, minuto); // Chama o construtor da superclasse
        this.evento = evento;
    }

    // Métodos getters e setters
    public String getEvento() { return evento; }
    public void setEvento(String evento) { this.evento = evento; }

    // Método para exibir os detalhes do evento
    @Override
    public String toString() {
        return "Evento: " + evento + " | Data e Hora: " + super.toString();
    }
}
