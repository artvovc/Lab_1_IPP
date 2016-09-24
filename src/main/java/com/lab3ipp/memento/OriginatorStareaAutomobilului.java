package com.lab3ipp.memento;

/**
 * Created by Artemie on 24.09.2016.
 */
public class OriginatorStareaAutomobilului {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveState(){
        return new Memento(state);
    }

    public void restoreState(Memento memento){
        this.state = memento.getState();
    }
}
