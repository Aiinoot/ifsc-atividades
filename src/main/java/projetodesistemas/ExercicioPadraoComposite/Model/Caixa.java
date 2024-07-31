package projetodesistemas.ExercicioPadraoComposite.Model;

import projetodesistemas.ExercicioPadraoComposite.Interfaces.Component;

import java.util.ArrayList;
import java.util.List;

public class Caixa implements Component {

    List<Component> children = new ArrayList<>();

    public Caixa(){
    }
    @Override
    public Double somaValores() {
        Double valor = 0.0;
        for (Component component : children) {
            valor += component.somaValores();
        }
        return valor;
    }

    public void addChildren(Component component){
        children.add(component);
    }

    public void removeChildren(Component component){
        children.remove(component);
    }

    public List<Component> getChildren() {
        return children;
    }
}
