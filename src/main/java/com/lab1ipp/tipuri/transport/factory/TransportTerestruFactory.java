package com.lab1ipp.tipuri.transport.factory;


import com.lab1ipp.tipuri.transport.AbstractTransport;
import com.lab1ipp.tipuri.transport.ITransport;
import com.lab1ipp.tipuri.transport.terestru.Automobil;
import com.lab1ipp.tipuri.transport.terestru.Camion;
import com.lab1ipp.tipuri.transport.terestru.Motocicleta;

/**
 * Created by Artemie on 11.09.2016.
 */
public class TransportTerestruFactory extends AbstractTransport {
    public ITransport getTransportTerestru(String tipTransport) {
        if(tipTransport.equals("automobil"))return new Automobil();
        if(tipTransport.equals("camion"))return new Camion();
        if(tipTransport.equals("motocicleta"))return new Motocicleta();
        return null;
    }

    public ITransport getTransportAcvatic(String tipTransport) {
        return null;
    }

    public ITransport getTransportAerian(String tipTransport) {
        return null;
    }
}
