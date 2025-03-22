package listClassesAbstratasPolimorfismoInterfaces.ItemDeBiblioteca;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{
    private boolean emprestado;
    private String localizacao;

    // Construtor
    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDaEdicao, String localizacao) {
        super(titulo, autor, numeroDePaginas, anoDaEdicao);
        this.localizacao = localizacao;
        this.emprestado = false; // Inicialmente não está emprestado
    }

    // Implementação dos métodos da interface
    @Override
    public boolean estaEmprestado() {
        return emprestado;
    }

    @Override
    public void empresta() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    @Override
    public void devolve() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("O livro já estava disponível.");
        }
    }

    @Override
    public String localizacao() {
        return "Localização: " + localizacao;
    }

    @Override
    public String descricao() {
        return "Livro da biblioteca: " + qualTitulo() + " de " + qualAutor();
    }

    // Sobrescrevendo toString para incluir mais informações
    @Override
    public String toString() {
        return super.toString() + "\n" + localizacao() + "\nEmprestado: " + (emprestado ? "Sim" : "Não");
    }
}
