package com.lab1ipp.exterior;

/**
 * Created by Artemie on 11.09.2016.
 */
public class RoataFactory {
    public IRoata getClone(IRoata roata){
        return roata.copy();
    }
}
