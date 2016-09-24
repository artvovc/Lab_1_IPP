package com.lab3ipp.memento;

/**
 * Created by Artemie on 24.09.2016.
 */
public class Memento {
    private final String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
}
