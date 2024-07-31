package projetodesistemas.CompositeShape.Model;

import projetodesistemas.CompositeShape.Interface.Shape;

public class Triangle implements Shape {
    @Override
    public void draw(String cor){
        System.out.println("Triangle: Cor =  " + cor);
    }
    public Triangle() {
    }
}
