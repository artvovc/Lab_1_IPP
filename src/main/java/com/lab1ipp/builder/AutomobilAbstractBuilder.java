package com.lab1ipp.builder;

import com.lab1ipp.tipuri.transport.ITransport;
import com.lab1ipp.tipuri.transport.terestru.Automobil;
/**
 * Created by Artemie on 11.09.2016.
 */
public abstract class AutomobilAbstractBuilder {
    protected Automobil automobil;

    public Automobil getAutomobil() {
        return automobil;
    }

    public void setAutomobil(ITransport automobil) {
        this.automobil = (Automobil) automobil;
    }

    public abstract void buildSetCuloarea(String color);
    public abstract void buildSetMotorina(String motorina);
    public abstract void buildSetFerestre(String ferestre);
}
