/* QUESTÃO 30:  
Escreva as classes LivroLivraria e LivroBiblioteca que herdam da classe Livro. Quais as
diferenças entre as duas classes e que campos elas têm em comum? Defina os atributos
de cada classe e escreva um aplicativo de teste que demonstre o uso das classes criadas. */

package listReusoDeClasses.Livros;

public class LivroBiblioteca extends Livro{
    private int numExemplares;
    private boolean emprestado;

    // Construtor
    public LivroBiblioteca(String titulo, String autor, int anoPublicacao, String isbn, int numExemplares, boolean emprestado) {
        super(titulo, autor, anoPublicacao, isbn); // Chama o construtor da classe base
        this.numExemplares = numExemplares;
        this.emprestado = emprestado;
    }

    // Getters e Setters
    public int getNumExemplares() { return numExemplares; }
    public void setNumExemplares(int numExemplares) { this.numExemplares = numExemplares; }

    public boolean isEmprestado() { return emprestado; }
    public void setEmprestado(boolean emprestado) { this.emprestado = emprestado; }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + " | Exemplares: " + numExemplares + " | Emprestado: " + (emprestado ? "Sim" : "Não");
    }
}
