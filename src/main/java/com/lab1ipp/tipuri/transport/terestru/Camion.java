package com.lab1ipp.tipuri.transport.terestru;

import com.lab1ipp.tipuri.transport.AbstractComponente;
import com.lab1ipp.tipuri.transport.CapacitateMaxima;
import com.lab1ipp.tipuri.transport.ITransport;

/**
 * Created by Artemie on 11.09.2016.
 */
public class Camion extends AbstractComponente implements CapacitateMaxima {

    public Integer nrRoti = 6;

    public Integer getViteza() {
        return 200;
    }

    public Integer getNrRoti() {
        return nrRoti;
    }

    public void setNrRoti(Integer nrRoti) {
        this.nrRoti = nrRoti;
    }
}
