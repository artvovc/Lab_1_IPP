package com.lab1ipp.tipuri.transport.aerian;

import com.lab1ipp.tipuri.transport.AbstractComponente;
import com.lab1ipp.tipuri.transport.ITransport;

/**
 * Created by Artemie on 11.09.2016.
 */
public class Submarin extends AbstractComponente implements ITransport {

    public Integer nrRoti = 0;

    public Integer getViteza() {
        return 50;
    }

    public Integer getNrRoti() {
        return nrRoti;
    }

    public void setNrRoti(Integer nrRoti) {
        this.nrRoti = nrRoti;
    }
}
