package projetodesistemas.Interfaces;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Cliente {
    public static void main(String[] args) {
        FormaGeometrica formaQuadrado = new Quadrado(10f);
        System.out.println("Área do quadrado: " + formaQuadrado.calcularArea());

        FormaGeometrica formaCirculo = new Circulo(10f);
        System.out.println("Área do círculo: " + formaCirculo.calcularArea());
    }
}
