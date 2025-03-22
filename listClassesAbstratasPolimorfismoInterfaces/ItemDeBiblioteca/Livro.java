package listClassesAbstratasPolimorfismoInterfaces.ItemDeBiblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int anoDaEdicao;

    // Construtor
    public Livro(String titulo, String autor, int numeroDePaginas, int anoDaEdicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDaEdicao = anoDaEdicao;
    }

    // Métodos de acesso
    public String qualTitulo() {
        return titulo;
    }

    public String qualAutor() {
        return autor;
    }

    // toString para exibir os detalhes do livro
    @Override
    public String toString() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nPáginas: " + numeroDePaginas + "\nAno: " + anoDaEdicao;
    }
}
