package com.lab1ipp.tipuri.transport.factory;

import com.lab1ipp.tipuri.transport.AbstractTransport;
import com.lab1ipp.tipuri.transport.ITransport;
import com.lab1ipp.tipuri.transport.aerian.Barca;
import com.lab1ipp.tipuri.transport.aerian.Submarin;

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
}
