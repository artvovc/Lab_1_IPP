package com.lab3ipp.template;

/**
 * Created by Artemie on 24.09.2016.
 */
public class RidicaDealulCuAutomobil extends RidicaDealul{
    @Override
    public void incarcaVehicolulCuCombustibil() {
        System.out.println("Deschid rezervorul");
        System.out.println("Umplu rezervorul");
        System.out.println("Inchid rezervorul");
    }

    @Override
    public void intraInVehicol() {
        System.out.println("Deschid usa");
        System.out.println("Intru in automobil");
        System.out.println("Inchid usa");
    }

    @Override
    public void aprindeMotorul() {
        System.out.println("Bag cheiele");
        System.out.println("Aprind motorul");
    }

    @Override
    public void ridicaDealul() {
        System.out.println("Apas pedala de accelerare");
        System.out.println("Ma deplases innainte");
    }
}
