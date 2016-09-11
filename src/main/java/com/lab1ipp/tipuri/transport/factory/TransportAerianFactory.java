package com.lab1ipp.tipuri.transport.factory;

import com.lab1ipp.tipuri.transport.AbstractTransport;
import com.lab1ipp.tipuri.transport.ITransport;
import com.lab1ipp.tipuri.transport.acvatic.Avion;
import com.lab1ipp.tipuri.transport.acvatic.Elecopter;

/**
 * Created by Artemie on 11.09.2016.
 */
public class TransportAerianFactory extends AbstractTransport {
    public ITransport getTransportTerestru(String tipTransport) {
        return null;
    }

    public ITransport getTransportAcvatic(String tipTransport) {
        return null;
    }

    public ITransport getTransportAerian(String tipTransport) {
        if(tipTransport.equals("avion"))return new Avion();
        if(tipTransport.equals("elecopter"))return new Elecopter();
        return null;
    }
}
