package projetodesistemas.CompositeShape;

import projetodesistemas.CompositeShape.Interface.Shape;
import projetodesistemas.CompositeShape.Model.Circle;
import projetodesistemas.CompositeShape.Model.Drawing;
import projetodesistemas.CompositeShape.Model.Triangle;

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
