package projetodesistemas.observer;

import projetodesistemas.observer.Model.ConcreteObserver;
import projetodesistemas.observer.Model.ConcreteSubject;

public class MainObserver {
    public static void main(String[] args) {
        ConcreteObserver obs1 = new ConcreteObserver("obs1");
        ConcreteObserver obs2 = new ConcreteObserver("obs2");
        ConcreteObserver obs3 = new ConcreteObserver("obs3");

        ConcreteSubject topic = new ConcreteSubject();

        topic.register(obs1);
        topic.register(obs2);
        topic.register(obs3);

        obs1.setSubject(topic);
        obs2.setSubject(topic);
        obs3.setSubject(topic);

        topic.postMessage("Alo mundo!");

    }
}
