package listClassesAbstratasPolimorfismoInterfaces.Desenho;

import listClassesAbstratasPolimorfismoInterfaces.FiguraGeometrica.Circulo;
import listClassesAbstratasPolimorfismoInterfaces.FiguraGeometrica.Quadrado;
import listClassesAbstratasPolimorfismoInterfaces.FiguraGeometrica.Triangulo;

public class Principal {
     public static void main(String[] args) {
        // Criando dois desenhos
        Desenho desenho1 = new Desenho(new Circulo(), 5, 10, new Quadrado(), 15, 20);
        Desenho desenho2 = new Desenho(new Quadrado(), 8, 12, new Triangulo(), 18, 25);

        // Apresentando os desenhos
        System.out.println("Desenho 1:");
        desenho1.apresenta();

        System.out.println("Desenho 2:");
        desenho2.apresenta();
    }
}
