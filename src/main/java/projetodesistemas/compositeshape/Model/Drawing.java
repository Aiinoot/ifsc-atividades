package projetodesistemas.compositeshape.Model;

import projetodesistemas.compositeshape.Interface.Shape;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
    private List<Shape> children = new ArrayList<Shape>();

    public Drawing() {

    }

    @Override
    public void draw(String cor) {
        for (Shape shape : children) {
            shape.draw(cor);
        }
    }
    public void addChildren(Shape c) {
         children.add(c);
    }
    public void removeChildren(Shape c) {
        children.remove(c);
    }
    public List<Shape> getChildren() {
        return children;
    }
    public Drawing(List<Shape> children) {
    }
    public void clear(){
        children.clear();
    }


}
