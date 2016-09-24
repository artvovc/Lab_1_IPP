package com.lab3ipp.template;

/**
 * Created by Artemie on 24.09.2016.
 */
public abstract class RidicaDealul {
    private int minLitriDeCombustibil = 0;
    public abstract void incarcaVehicolulCuCombustibil();
    public abstract void intraInVehicol();
    public abstract void aprindeMotorul();
    public abstract void ridicaDealul();

    public void rezolv(){
        this.incarcaVehicolulCuCombustibil();
        this.intraInVehicol();
        this.aprindeMotorul();
        this.ridicaDealul();
    }

}
