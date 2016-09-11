package com.lab1ipp.tipuri.transport;

import com.lab1ipp.tipuri.transport.factory.TransportAcvaticFactory;
import com.lab1ipp.tipuri.transport.factory.TransportAerianFactory;
import com.lab1ipp.tipuri.transport.factory.TransportTerestruFactory;

/**
 * Created by Artemie on 11.09.2016.
 */
public class TransportProducator {
    public static AbstractTransport getFactory(String tipulDeTransport)
    {
        if(tipulDeTransport.equals("terestru")){
            return new TransportTerestruFactory();
        }
        if(tipulDeTransport.equals("aerian")){
            return new TransportAerianFactory();
        }
        if(tipulDeTransport.equals("acvatic")){
            return new TransportAcvaticFactory();
        }
        return null;
    }
}
