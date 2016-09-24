package com.lab3ipp.state;

/**
 * Created by Artemie on 24.09.2016.
 */
public class StareaDeRepaus implements StateStareaAutomobilului {
    @Override
    public void doAction(ContextAutomobil contextAutomobil) {
        System.out.println("Automobilul se afla in starea de repaus.");
        contextAutomobil.setStateStareaAutomobilului(this);
    }
}
