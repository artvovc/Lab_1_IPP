package com.lab1ipp.tipuri.transport.terestru;


import com.lab1ipp.tipuri.transport.AbstractComponente;
import com.lab1ipp.tipuri.transport.ITransport;

/**
 * Created by Artemie on 11.09.2016.
 */
public class Automobil extends AbstractComponente implements ITransport {

    public Integer nrRoti = 4;

    public Integer getViteza() {
        return 300;
    }

    public Integer getNrRoti() {
        return nrRoti;
    }

    public void setNrRoti(Integer nrRoti) {
        this.nrRoti = nrRoti;
    }
}
