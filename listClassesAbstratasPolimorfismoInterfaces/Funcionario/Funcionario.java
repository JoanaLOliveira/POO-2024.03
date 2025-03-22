/* Defina uma classe para conter informações sobre um funcionário de uma empresa (classe
Funcionario). Quais são os atributos dessa classe? Inclua entre eles o salário que o funcionário deve receber por hora trabalhada. Implemente, para essa classe, pelo menos
dois métodos construtores: um que receba apenas o nome do funcionário e assuma valores padrão para os demais atributos (assuma que o funcionário deve receber dois reais
por hora trabalhada); o segundo construtor deve receber, além do nome, o valor que o referido trabalhador deve receber por hora trabalhada. Identifique e implemente os demais
métodos que achar conveniente para um objeto da classe Funcionario.
 */

package listClassesAbstratasPolimorfismoInterfaces.Funcionario;

public class Funcionario {
    private String nome;
    private double salarioPorHora;
    private int horasTrabalhadas;

    public Funcionario(String nome){
        this.nome=nome;
        this.salarioPorHora=2.00;
        this.horasTrabalhadas=0;
    }

    public void registrarHoras(int horas){
        if (horas>0) {
            this.horasTrabalhadas+=horas;
        } else {
            System.out.println("Horas inválidas");
        }
    }

    public double calcularSalario(){
        return this.horasTrabalhadas * this.salarioPorHora;
    }

    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário por Hora: R$ " + this.salarioPorHora);
        System.out.println("Horas Trabalhadas: " + this.horasTrabalhadas);
        System.out.println("Salário Total: R$ " + calcularSalario());
    }
}
