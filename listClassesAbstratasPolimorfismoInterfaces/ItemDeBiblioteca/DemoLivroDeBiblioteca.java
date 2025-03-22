package listClassesAbstratasPolimorfismoInterfaces.ItemDeBiblioteca;

public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        // Criando um objeto da classe LivroDeBiblioteca
        LivroDeBiblioteca livro = new LivroDeBiblioteca("Java para Iniciantes", "Herbert Schildt", 450, 2021, "Corredor 3, Prateleira B");

        // Exibindo informações do livro
        System.out.println(livro.toString());

        // Testando empréstimo e devolução
        livro.empresta();
        System.out.println("Status após empréstimo: " + (livro.estaEmprestado() ? "Emprestado" : "Disponível"));

        livro.devolve();
        System.out.println("Status após devolução: " + (livro.estaEmprestado() ? "Emprestado" : "Disponível"));
    }
}
