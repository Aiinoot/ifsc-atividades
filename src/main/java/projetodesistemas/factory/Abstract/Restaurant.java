package projetodesistemas.factory.Abstract;

import projetodesistemas.factory.Interface.Burger;

public abstract class Restaurant {
    public void orderBurger() {
        System.out.println("Novo pedido de hamburger");
        Burger burger = createBurger();
        burger.prepare();
    }

    public abstract Burger createBurger();

}
