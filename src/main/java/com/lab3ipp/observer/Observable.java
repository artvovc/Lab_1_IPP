package com.lab3ipp.observer;

/**
 * Created by Artemie on 24.09.2016.
 */
public interface Observable {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
