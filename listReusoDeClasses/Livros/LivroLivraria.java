/* QUESTÃO 30:  
Escreva as classes LivroLivraria e LivroBiblioteca que herdam da classe Livro. Quais as
diferenças entre as duas classes e que campos elas têm em comum? Defina os atributos
de cada classe e escreva um aplicativo de teste que demonstre o uso das classes criadas. */


package listReusoDeClasses.Livros;

public class LivroLivraria extends Livro {
    private double preco;
    private int estoque;

    // Construtor
    public LivroLivraria(String titulo, String autor, int anoPublicacao, String isbn, double preco, int estoque) {
        super(titulo, autor, anoPublicacao, isbn); // Chama o construtor da classe base
        this.preco = preco;
        this.estoque = estoque;
    }

    // Getters e Setters
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public int getEstoque() { return estoque; }
    public void setEstoque(int estoque) { this.estoque = estoque; }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + " | Preço: R$" + preco + " | Estoque: " + estoque;
    }
}
