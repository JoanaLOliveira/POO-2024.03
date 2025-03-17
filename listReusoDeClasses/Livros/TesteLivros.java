/* QUESTÃO 30:  
Escreva as classes LivroLivraria e LivroBiblioteca que herdam da classe Livro. Quais as
diferenças entre as duas classes e que campos elas têm em comum? Defina os atributos
de cada classe e escreva um aplicativo de teste que demonstre o uso das classes criadas. */

package listReusoDeClasses.Livros;

public class TesteLivros {
    public static void main(String[] args) {
        // Criando um livro de livraria
        LivroLivraria livro1 = new LivroLivraria("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "978-0-0611-2263-8", 99.90, 15);

        // Criando um livro de biblioteca
        LivroBiblioteca livro2 = new LivroBiblioteca("1984", "George Orwell", 1949, "978-0-4522-8414-7", 5, false);

        // Exibindo informações
        System.out.println("Livro na Livraria:");
        System.out.println(livro1);

        System.out.println("\nLivro na Biblioteca:");
        System.out.println(livro2);
    }
}
