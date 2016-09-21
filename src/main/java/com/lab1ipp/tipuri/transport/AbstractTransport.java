package com.lab1ipp.tipuri.transport;

/**
 * Created by Artemie on 11.09.2016.
 */
public abstract class AbstractTransport {
    public abstract ITransport getTransportTerestru(String tipTransport);
    public abstract ITransport getTransportAcvatic(String tipTransport);
    public abstract ITransport getTransportAerian(String tipTransport);
    public abstract CapacitateMaxima getCapMax(String tipTransport);
    public abstract CapacitateMinima getCapMin(String tipTransport);
}
