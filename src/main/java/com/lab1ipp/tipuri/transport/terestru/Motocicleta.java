package com.lab1ipp.tipuri.transport.terestru;


import com.lab1ipp.tipuri.transport.AbstractComponente;
import com.lab1ipp.tipuri.transport.ITransport;

/**
 * Created by Artemie on 11.09.2016.
 */
public class Motocicleta extends AbstractComponente implements ITransport {

    public Integer nrRoti = 2;

    public Integer getViteza() {
        return 250;
    }

    public Integer getNrRoti() {
        return nrRoti;
    }

    public void setNrRoti(Integer nrRoti) {
        this.nrRoti = nrRoti;
    }
}
