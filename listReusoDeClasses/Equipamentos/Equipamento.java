/* QUESTÃO 28
Crie as classes Equipamento e Computador, cada uma com dois atributos privados à
sua escolha. Além disso, a classe Computador deverá herdar os métodos e atributos
da classe Equipamento. Escreva métodos de acesso, get’s e set’s, para os atributos
definidos em ambas as classes. Cada classe também deve ter um método toString.
Lembre-se que o método toString de Computador também deve representar os atributos
herdados. Por fim, crie uma classe executável, TestaEquipamento, para instanciar um
objeto de cada classe, inicializar seus atributos e imprimí-los. */

package listReusoDeClasses.Equipamentos;

public class Equipamento {
    private String marca;
    private double preco;

    // Construtor
    public Equipamento(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método toString para exibir os dados do equipamento
    @Override
    public String toString() {
        return "Marca: " + marca + " | Preço: R$" + preco;
    }
}
