package projetodesistemas.factory.Model;

import projetodesistemas.factory.Interface.Burger;

public class VeggieBuger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparando hamburger vegano");
    }
}
