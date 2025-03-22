/* Crie uma classe Desenho que possui dois atributos do tipo FiguraGeometrica (criado na
questão anterior) e suas respectivas coordenadas em um plano bidimensional. Escreva
um construtor para a classe Desenho que inicialize todos os atributos através dos parâmetros. Implemente também o método apresenta() que, para cada FiguraGeometrica
em um Desenho, informa suas coordenadas e imprime sua descrição. Por fim, crie uma
classe executável, Principal, que cria dois objetos do tipo Desenho e chama seu meu método apresenta. O primeiro Desenho deve ser formado por um Circulo e um Quadrado e
o segundo por um Quadrado e um Triangulo. */
package listClassesAbstratasPolimorfismoInterfaces.Desenho;

import listClassesAbstratasPolimorfismoInterfaces.FiguraGeometrica.Quadrado;
import listClassesAbstratasPolimorfismoInterfaces.FiguraGeometrica.Triangulo;

public class Desenho {
    private FiguraGeometrica figura1;
    private int x1, y1;
    private FiguraGeometrica figura2;
    private int x2, y2;

    // Construtor para inicializar todos os atributos
    public Desenho(Quadrado figura1, int x1, int y1, Triangulo figura2, int x2, int y2) {
        this.figura1 = figura1;
        this.x1 = x1;
        this.y1 = y1;
        this.figura2 = figura2;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Método que exibe informações sobre as figuras e suas coordenadas
    public void apresenta() {
        System.out.println("Figura 1 está na posição (" + x1 + ", " + y1 + ")");
        figura1.descricao();
        System.out.println("Figura 2 está na posição (" + x2 + ", " + y2 + ")");
        figura2.descricao();
        System.out.println("---------------------------------------");
    }
}
