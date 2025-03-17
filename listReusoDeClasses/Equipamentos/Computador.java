/* QUESTÃO 28
Crie as classes Equipamento e Computador, cada uma com dois atributos privados à
sua escolha. Além disso, a classe Computador deverá herdar os métodos e atributos
da classe Equipamento. Escreva métodos de acesso, get’s e set’s, para os atributos
definidos em ambas as classes. Cada classe também deve ter um método toString.
Lembre-se que o método toString de Computador também deve representar os atributos
herdados. Por fim, crie uma classe executável, TestaEquipamento, para instanciar um
objeto de cada classe, inicializar seus atributos e imprimí-los. */

package listReusoDeClasses.Equipamentos;

public class Computador extends Equipamento{
    private String processador;
    private int memoriaRAM; // Em GB

    // Construtor
    public Computador(String marca, double preco, String processador, int memoriaRAM) {
        super(marca, preco); // Chama o construtor da classe base
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
    }

    // Getters e Setters
    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    // Método toString que inclui atributos da classe base e da classe derivada
    @Override
    public String toString() {
        return super.toString() + " | Processador: " + processador + " | Memória RAM: " + memoriaRAM + "GB";
    }
}
