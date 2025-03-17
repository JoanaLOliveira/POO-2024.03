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

public class TesteEventos {
    public static void main(String[] args) {
        // Criando evento usando Delegação
        EventoDelegacao evento1 = new EventoDelegacao("Reunião de Negócios", 20, 3, 2025, 14, 30);

        // Criando evento usando Herança
        EventoHeranca evento2 = new EventoHeranca("Aniversário", 5, 7, 2025, 19, 0);

        // Exibindo os eventos
        System.out.println("Usando Delegação:");
        System.out.println(evento1);

        System.out.println("\nUsando Herança:");
        System.out.println(evento2);
    }
}
