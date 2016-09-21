package com.lab1ipp.tipuri.transport.factory;

import com.lab1ipp.tipuri.transport.AbstractTransport;
import com.lab1ipp.tipuri.transport.CapacitateMaxima;
import com.lab1ipp.tipuri.transport.CapacitateMinima;
import com.lab1ipp.tipuri.transport.ITransport;
import com.lab1ipp.tipuri.transport.aerian.Barca;
import com.lab1ipp.tipuri.transport.aerian.Submarin;
import com.lab1ipp.tipuri.transport.terestru.Automobil;
import com.lab1ipp.tipuri.transport.terestru.Camion;

/**
 * Created by Artemie on 11.09.2016.
 */
public class TransportAcvaticFactory extends AbstractTransport {
    public ITransport getTransportTerestru(String tipTransport) {
        return null;
    }

    public ITransport getTransportAcvatic(String tipTransport) {
        if(tipTransport.equals("barca"))return new Barca();
        if(tipTransport.equals("submarin"))return new Submarin();
        return null;
    }

    public ITransport getTransportAerian(String tipTransport) {
        return null;
    }

    public CapacitateMaxima getCapMax(String tipTransport) {
        if(tipTransport.equals("camion")) return new Camion();
        return null;
    }

    public CapacitateMinima getCapMin(String tipTransport) {
        if(tipTransport.equals("automobil")) return new Automobil();
        return null;
    }
}
