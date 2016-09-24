package com.lab3ipp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artemie on 24.09.2016.
 */
public class ConcreteObservableSistemaDeClimat implements Observable {
    private List<Observer> observerList = new ArrayList<>();
    private float temperatura;
    private float umiditatea;

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observerList) observer.update(temperatura,umiditatea);
    }

    public void setparameters(float temperatura,float umiditatea){
        this.temperatura = temperatura;
        this.umiditatea = umiditatea;
        notifyObservers();
    }
}
