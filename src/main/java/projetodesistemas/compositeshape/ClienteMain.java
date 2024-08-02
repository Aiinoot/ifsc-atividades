package projetodesistemas.compositeshape;

import projetodesistemas.compositeshape.Interface.Shape;
import projetodesistemas.compositeshape.Model.Circle;
import projetodesistemas.compositeshape.Model.Drawing;
import projetodesistemas.compositeshape.Model.Triangle;

public class ClienteMain {
    public static void main(String[] args) {
        Shape t1 = new Triangle();
        Shape t2 = new Triangle();
        Shape c1 = new Circle();
        Shape c2 = new Circle();

        Drawing d = new Drawing ();
        d.addChildren(t1);
        d.addChildren(t2);
        d.addChildren(c1);
        d.addChildren(c2);
        d.draw("Azul");

    }
}
