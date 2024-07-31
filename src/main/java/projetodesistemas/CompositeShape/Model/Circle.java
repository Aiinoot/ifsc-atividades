package projetodesistemas.CompositeShape.Model;

import projetodesistemas.CompositeShape.Interface.Shape;

public class Circle implements Shape {
    @Override
    public void draw(String cor){
        System.out.println("Circle: Cor =  " + cor);
    }
    public Circle() {

    }
}
