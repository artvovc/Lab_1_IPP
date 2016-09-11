package com.lab1ipp.exterior;

/**
 * Created by Artemie on 11.09.2016.
 */
public class RoataDeIarna implements IRoata{

    public RoataDeIarna(Integer dimensiune) {
        this.dimensiune = dimensiune;
    }

    private Integer dimensiune = 30;

    public Integer getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(Integer dimensiune) {
        this.dimensiune = dimensiune;
    }

    public IRoata copy() {
        RoataDeIarna roataDeIarna = null;
        try {
            roataDeIarna = (RoataDeIarna) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return roataDeIarna;
    }

    public Integer getDimensiunea() {
        return dimensiune;
    }

    public String getClazz(){
        return this.getClass().toString();
    }

}
