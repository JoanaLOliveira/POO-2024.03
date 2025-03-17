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

public class Assistente extends Funcionario {
    private int matricula;

    // Construtor
    public Assistente(String nome, double salario, int matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    // Getters e Setters
    public int getMatricula() { return matricula; }
    public void setMatricula(int matricula) { this.matricula = matricula; }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + " | Matrícula: " + matricula;
    }
}
