/* QUESTÃO 32: 
Implemente a classe Funcionario com nome, salário e os métodos:
• aumentarSalario : recebe o valor do aumento e o adiciona ao salário;
• ganhoAnual : computa o valor recebido em 12 meses e o 13º;
• e toString : retorna uma representação textual de um objeto de Funcionario.
(i) Crie também a classe Assistente, que também é um funcionário e que 
    possui um número de matrícula (e seus métodos de acesso), além de um método toString.
(ii) Escreva as classes Tecnico e Administrativo
    • Ambas as classes são filhas da classe Assistente
    • Ambas as classes devem ter um método ganhoAnual
    • Assistentes Técnicos possuem um bônus salarial
    • Assistentes Administrativos possuem um turno (dia ou noite) e um adicional noturno
(iii) Lembre-se que o 13o não possui adicional noturno, mas pode possuir bônus salarial
    (se aplicável).*/

package listReusoDeClasses.Funcionario;

public class Tecnico extends Assistente {
    private double bonusSalarial;

    // Construtor
    public Tecnico(String nome, double salario, int matricula, double bonusSalarial) {
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    // Getters e Setters
    public double getBonusSalarial() { return bonusSalarial; }
    public void setBonusSalarial(double bonusSalarial) { this.bonusSalarial = bonusSalarial; }

    // Método ganhoAnual (13º inclui o bônus)
    @Override
    public double ganhoAnual() {
        return (getSalario() * 12) + getSalario() + bonusSalarial;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + " | Bônus Salarial: R$ " + bonusSalarial;
    }
}
