package projetodesistemas.factory.Model;

import projetodesistemas.factory.Abstract.Restaurant;
import projetodesistemas.factory.Interface.Burger;

public class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        System.out.println("Montando hamburger de carne");
        return new BeefBurger();
    }
}
