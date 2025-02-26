package listaexe.classep2;

public class ContaCorrenteSobrecarga {
    int conta;
    int agencia;
    double saldo;

    void efetuarSaque(double valor){
        this.saldo = this.saldo - valor;
    }
    
    void efetuarDeposito(double valor){
        this.saldo = this.saldo+valor;
    }

    void imprimirAtributos(int a){
        System.out.println("Imprime Atributos!");
    }

    void imprimirAtributos(char a){
        System.out.println("Imprime Atributos!");
    }

    void imprimirAtributos(char a){
        System.out.println("Imprime Atributos!");
    }

}
