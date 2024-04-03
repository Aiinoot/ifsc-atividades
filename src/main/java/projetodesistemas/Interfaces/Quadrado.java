package projetodesistemas.Interfaces;

public class Quadrado implements FormaGeometrica{

    Float lado;

    public Quadrado(Float lado) {
        this.lado = lado;
    }

    @Override
    public Float calcularArea() {
        return (lado * lado);
    }
}
