/* QUESTÃO 28
Crie as classes Equipamento e Computador, cada uma com dois atributos privados à
sua escolha. Além disso, a classe Computador deverá herdar os métodos e atributos
da classe Equipamento. Escreva métodos de acesso, get’s e set’s, para os atributos
definidos em ambas as classes. Cada classe também deve ter um método toString.
Lembre-se que o método toString de Computador também deve representar os atributos
herdados. Por fim, crie uma classe executável, TestaEquipamento, para instanciar um
objeto de cada classe, inicializar seus atributos e imprimí-los. */

package listReusoDeClasses.Equipamentos;

public class TesteEquipamento {
    public static void main(String[] args) {
        // Criando um objeto da classe Equipamento
        Equipamento equipamento = new Equipamento("Samsung", 1200.00);
        
        // Criando um objeto da classe Computador
        Computador computador = new Computador("Dell", 4500.00, "Intel Core i7", 16);

        // Exibindo os dados dos objetos
        System.out.println("Dados do Equipamento:");
        System.out.println(equipamento);

        System.out.println("\nDados do Computador:");
        System.out.println(computador);
    }
}
