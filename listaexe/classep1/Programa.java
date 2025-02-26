package listaexe.classep1;

class Conta {
    double saldo;
    void sacar (double qtd) {
        saldo -=qtd;
    }
    void depositar (double qtd){
        saldo += qtd;
    }
}

public class Programa{
    public static void main(String[] args) {
        Conta c1=new Conta();
        c1.depositar(1000);
        Conta c2 = c1;
        c1.sacar(500);
        System.out.println(c1.saldo);
    }
}
