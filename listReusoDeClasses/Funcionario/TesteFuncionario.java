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

public class TesteFuncionario {
    public static void main(String[] args) {
        // Criando um funcionário comum
        Funcionario func = new Funcionario("Carlos Silva", 3000);
        
        // Criando um assistente
        Assistente assist = new Assistente("Ana Souza", 3500, 1234);

        // Criando um técnico com bônus
        Tecnico tecnico = new Tecnico("Bruno Lima", 4000, 5678, 500);

        // Criando um assistente administrativo noturno
        Administrativo admin = new Administrativo("Juliana Costa", 3200, 9101, "noite", 300);

        // Exibindo informações
        System.out.println("Funcionário:");
        System.out.println(func);
        System.out.println("Ganho Anual: R$ " + func.ganhoAnual());

        System.out.println("\nAssistente:");
        System.out.println(assist);
        System.out.println("Ganho Anual: R$ " + assist.ganhoAnual());

        System.out.println("\nTécnico:");
        System.out.println(tecnico);
        System.out.println("Ganho Anual: R$ " + tecnico.ganhoAnual());

        System.out.println("\nAdministrativo:");
        System.out.println(admin);
        System.out.println("Ganho Anual: R$ " + admin.ganhoAnual());
    }
}
