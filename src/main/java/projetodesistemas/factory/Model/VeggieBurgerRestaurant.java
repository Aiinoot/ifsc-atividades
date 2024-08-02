package projetodesistemas.factory.Model;

import projetodesistemas.factory.Abstract.Restaurant;
import projetodesistemas.factory.Interface.Burger;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        System.out.println("Montando hamburger vegano");
        return new VeggieBuger();
    }
}
