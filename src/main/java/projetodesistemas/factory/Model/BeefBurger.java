package projetodesistemas.factory.Model;

import projetodesistemas.factory.Interface.Burger;

public class BeefBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparando hamburger de carne");
    }
}
