package com.lab1ipp.exterior;

/**
 * Created by Artemie on 11.09.2016.
 */
public class RoataDeVara implements IRoata{

    public RoataDeVara(Integer dimensiune) {
        this.dimensiune = dimensiune;
    }

    private Integer dimensiune = 10;

    public Integer getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(Integer dimensiune) {
        this.dimensiune = dimensiune;
    }

    public IRoata copy() {
        RoataDeVara roataDeVara = null;
        try {
            roataDeVara = (RoataDeVara) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return roataDeVara;
    }

    public Integer getDimensiunea() {
        return dimensiune;
    }

    public String getClazz(){
        return this.getClass().toString();
    }
}
