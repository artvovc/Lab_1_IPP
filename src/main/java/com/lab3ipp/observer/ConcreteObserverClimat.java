package com.lab3ipp.observer;

/**
 * Created by Artemie on 24.09.2016.
 */
public class ConcreteObserverClimat implements Observer {
    private float temperatura;
    private float umiditatea;
    private ConcreteObservableSistemaDeClimat concreteObservableSistemaDeClimat;

    public ConcreteObserverClimat(ConcreteObservableSistemaDeClimat concreteObservableSistemaDeClimat) {
        this.concreteObservableSistemaDeClimat = concreteObservableSistemaDeClimat;
        concreteObservableSistemaDeClimat.registerObserver(this);
    }

    @Override
    public void update(float temperature, float umiditatea) {
        this.temperatura = temperature;
        this.umiditatea = umiditatea;
    }

    @Override
    public String toString() {
        return "ConcreteObserverClimat( temperatura= " + temperatura + ", umiditatea=" + umiditatea + " );";
    }
}
