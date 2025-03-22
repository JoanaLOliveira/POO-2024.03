package listClassesAbstratasPolimorfismoInterfaces.FiguraGeometrica;

public class Principal {
    public static void main(String[] args) {
        // Criando objetos das subclasses
        FiguraGeometrica circulo = new Circulo();
        FiguraGeometrica quadrado = new Quadrado();
        FiguraGeometrica triangulo = new Triangulo();

        // Chamando o método descricao() de cada objeto
        circulo.descricao();
        quadrado.descricao();
        triangulo.descricao();
    }
}
