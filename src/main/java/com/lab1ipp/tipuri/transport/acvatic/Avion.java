package com.lab1ipp.tipuri.transport.acvatic;

import com.lab1ipp.tipuri.transport.AbstractComponente;
import com.lab1ipp.tipuri.transport.CapacitateMaxima;
import com.lab1ipp.tipuri.transport.ITransport;

/**
 * Created by Artemie on 11.09.2016.
 */
public class Avion extends AbstractComponente implements CapacitateMaxima {
    public Integer nrRoti = 8;

    public Integer getViteza() {
        return 400;
    }

    public Integer getNrRoti() {
        return nrRoti;
    }

    public void setNrRoti(Integer nrRoti) {
        this.nrRoti = nrRoti;
    }
}
