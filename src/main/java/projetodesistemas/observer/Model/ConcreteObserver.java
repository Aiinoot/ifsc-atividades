package projetodesistemas.observer.Model;

import projetodesistemas.observer.Interface.Observer;
import projetodesistemas.observer.Interface.Subject;

public class ConcreteObserver implements Observer {
    private String name;
    private Subject topíc;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String)topíc.getUpdate(this);
        if(msg != null){
            System.out.println(name + " fui avisado: " + msg);
        }
    }

    @Override
    public void setSubject(Subject subj) {
        this.topíc = subj;
    }
}
