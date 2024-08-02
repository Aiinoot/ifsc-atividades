package projetodesistemas.interfaces;

public class Circulo implements FormaGeometrica{

    Float raio;

    public Circulo(Float raio) {
        this.raio = raio;
    }

    @Override
    public Float calcularArea() {
        return (float) (Math.PI * raio * raio);
    }
}
