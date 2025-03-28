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

import java.util.Objects;

public class EntradaEmAgenda {
    private int hora;
    private int dia;
    private int mes;
    private int ano;
    private String assunto;

    public EntradaEmAgenda(int hora, int dia, int mes, int ano, String assunto){
        this.hora=hora;
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
        this.assunto=assunto;
    }

    public boolean ehNoDia(int dia, int mes, int ano) {
        return this.dia == dia && this.mes == mes && this.ano == ano;
    }

    @Override
    public String toString() {
        return String.format("Data: %02d/%02d/%d - Hora: %02d:%02d - Assunto: %s",
                dia, mes, ano, hora, 0, assunto);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntradaEmAgenda that = (EntradaEmAgenda) o;
        return hora == that.hora &&
                dia == that.dia &&
                mes == that.mes &&
                ano == that.ano &&
                Objects.equals(assunto, that.assunto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hora, dia, mes, ano, assunto);
    }
}

