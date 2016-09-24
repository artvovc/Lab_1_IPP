package com.lab2ipp.facade;

/**
 * Created by Artemie on 24.09.2016.
 */
public class FacadeSuportTehnic {
    private SistemaDeAlimentare sistemaDeAlimentare;
    private SistemaDeSecuritate sistemaDeSecuritate;
    private SistemaDeSiguranta  sistemaDeSiguranta;

    public FacadeSuportTehnic(){
        sistemaDeAlimentare = new SistemaDeAlimentare();
        sistemaDeSecuritate = new SistemaDeSecuritate();
        sistemaDeSiguranta  = new SistemaDeSiguranta();
    }

    public Boolean trecut(){
        if(     sistemaDeAlimentare.CombustibilProcent().equals("48%")  &&
                sistemaDeSiguranta.SigurantaProcent().equals("80%")     &&
                sistemaDeSecuritate.SecuritateaProcent().equals("75%")
                ) return true;
        return false;
    }
}
