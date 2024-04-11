package projetodesistemas.Observer.Model;

import projetodesistemas.Observer.Interface.Observer;
import projetodesistemas.Observer.Interface.Subject;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observers;
    private String message;

    public ConcreteSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obs) {
        if(!observers.contains(obs)){
            observers.add(obs);
        }
    }

    @Override
    public void unregister(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers){
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer obs) {
        return this.message;
    }

    public void postMessage(String msg){
        System.out.println("Nova Mensagem" + msg);
        this.message = msg;
        notifyObservers();
    }
}
