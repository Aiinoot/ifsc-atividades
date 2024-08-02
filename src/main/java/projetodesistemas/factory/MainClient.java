package projetodesistemas.factory;

import projetodesistemas.factory.Abstract.Restaurant;
import projetodesistemas.factory.Interface.Burger;
import projetodesistemas.factory.Model.BeefBurger;
import projetodesistemas.factory.Model.BeefBurgerRestaurant;
import projetodesistemas.factory.Model.VeggieBurgerRestaurant;

public class MainClient {
    public static void main(String[] args) {
        Restaurant beef = new BeefBurgerRestaurant();
        beef.orderBurger();

        Restaurant veggie = new VeggieBurgerRestaurant();
        veggie.orderBurger();
    }
}
