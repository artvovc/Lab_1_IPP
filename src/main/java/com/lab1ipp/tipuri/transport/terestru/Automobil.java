package com.lab1ipp.tipuri.transport.terestru;


import com.lab1ipp.tipuri.transport.AbstractComponente;
import com.lab1ipp.tipuri.transport.ITransport;

/**
 * Created by Artemie on 11.09.2016.
 */
public class Automobil extends AbstractComponente implements ITransport {


    private String motorina;

    private String culoarea;

    private String ferestre;

    private Integer nrRoti = 4;

    public Integer getViteza() {
        return 300;
    }

    public Integer getNrRoti() {
        return nrRoti;
    }

    public void setNrRoti(Integer nrRoti) {
        this.nrRoti = nrRoti;
    }

    public String getMotorina() {
        return motorina;
    }

    public void setMotorina(String motorina) {
        this.motorina = motorina;
    }

    public String getCuloarea() {
        return culoarea;
    }

    public void setCuloarea(String culoarea) {
        this.culoarea = culoarea;
    }

    public String getFerestre() {
        return ferestre;
    }

    public void setFerestre(String ferestre) {
        this.ferestre = ferestre;
    }

    @Override
    public String toString() {
        return "Automobil ( viteza = "+ getViteza()+", "+
                "nrRoti = "+ getNrRoti()+", "+
                "motorina = "+ getMotorina()+", "+
                "culoare = "+ getCuloarea()+", "+
                "ferestre = "+ getFerestre()+" ).";
    }
}
