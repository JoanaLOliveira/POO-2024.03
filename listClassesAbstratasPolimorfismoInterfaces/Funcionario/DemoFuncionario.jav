public class DemoFuncionario{
    public static void main (String[] args){
        Funcionario f1 = new Funcionario("João");
        f1.registrarHoras(10);
        f1.exibirDados();

        System.out.println();

        Funcionario f2 = new Funcionario("Maria", 5.00);
        f2.registrarHoras(20);
        f2.exibirDados();
    }
}