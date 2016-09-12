package com.lab1ipp.builder;
/**
 * Created by Artemie on 11.09.2016.
 */
public class AutomobilStandard extends AutomobilAbstractBuilder {
    public void buildSetCuloarea(String color) {
        automobil.setCuloarea(color);
    }

    public void buildSetMotorina(String motorina) {
        automobil.setMotorina(motorina);
    }

    public void buildSetFerestre(String ferestre) {
        automobil.setFerestre(ferestre);
    }
}
