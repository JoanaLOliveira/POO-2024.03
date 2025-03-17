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

public class Funcionario {
    private String nome;
    private double salario;

    // Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Métodos Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    // Método para aumentar o salário
    public void aumentarSalario(double aumento) {
        this.salario += aumento;
    }

    // Método para calcular ganho anual (salário de 12 meses + 13º)
    public double ganhoAnual() {
        return (salario * 12) + salario;
    }

    // Método toString
    @Override
    public String toString() {
        return "Nome: " + nome + " | Salário: R$ " + salario;
    }
}
