package projetodesistemas.Observer.Interface;

import projetodesistemas.Observer.Interface.Observer;

public interface Subject {
    public void register(Observer obs);
    public void unregister(Observer obs);
    public void notifyObservers();
    public Object getUpdate(Observer obs);
}
