/* QUESTÃO 17: Crie uma classe EntradaEmAgenda que contenha:
    • os dados necessários para armazenar uma entrada de agenda (hora, dia, mês, ano
    e assunto);
    • um construtor;
    • um método toString;
    • um método ehNoDia que recebe valores de dia, mês e ano e retorna true se o dia,
    mês e ano daquela instância da classe forem iguais aos argumentos passados.
Crie também uma classe Agenda que:
    • encapsule uma agenda de compromissos representada por um ArrayList de instâncias da classe EntradaEmAgenda;
        – este item é obrigatório. Caso não seja contemplado, toda a questão será desconsiderada
    • implemente um método construtor;
    • possua um método para adicionar um novo compromisso à lista de compromissos;
    • tenha um método listaDia que recebe valores de dia, mês e ano e lista todas as 
    instâncias de EntradaEmAgenda que caem naquele dia, mês e ano.
Por fim, escreva uma classe executável que crie uma Agenda, adicione a ela 2 compromissos e, usando o método listaDia, liste as entradas da agenda que tem a mesma da
data do seu aniversário. */

package listArraysEArrayLists.Agendas;

import java.util.List;

public class TesteAgenda {
    public static void main(String[] args) {
        // Criando uma nova agenda
        Agenda agenda = new Agenda();

        // Adicionando compromissos
        agenda.adicionarCompromisso(new EntradaEmAgenda(14, 16, 3, 2025, "Reunião de trabalho"));
        agenda.adicionarCompromisso(new EntradaEmAgenda(10, 16, 3, 2025, "Almoço com amigos"));

        // Listando compromissos no dia do aniversário (exemplo)
        int meuDia = 16;
        int meuMes = 3;
        int meuAno = 2025;

        List<EntradaEmAgenda> compromissosNoAniversario = agenda.listaDia(meuDia, meuMes, meuAno);

        System.out.println("Compromissos no dia do aniversário:");
        for (EntradaEmAgenda entrada : compromissosNoAniversario) {
            System.out.println(entrada);
        }
    }
}
