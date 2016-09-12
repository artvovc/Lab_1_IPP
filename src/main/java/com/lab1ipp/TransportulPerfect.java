package com.lab1ipp;

import com.lab1ipp.tipuri.transport.ITransport;

/**
 * Created by Artemie on 11.09.2016.
 */
public class TransportulPerfect {
    private static TransportulPerfect ourInstance = new TransportulPerfect();

    public static TransportulPerfect getInstance() {
        return ourInstance;
    }

    private TransportulPerfect() {
    }

    private ITransport ITransport;

    public ITransport getITransport() {
        return ITransport;
    }

    public void setITransport(ITransport ITransport) {
        this.ITransport = ITransport;
    }

    @Override
    public String toString() {
        return "Transportul( viteza = "+ ITransport.getViteza()+
                ", motor rotatii = "+ ITransport.getIMotor().getRotatii() + ", nrRoti = " +ITransport.getNrRoti()+" )";
    }
}
