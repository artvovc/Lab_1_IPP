package com.lab2ipp.adapter;

/**
 * Created by Artemie on 24.09.2016.
 */
public class AdapterAutospecialistSpecificat implements TargetAutospecialistul {
    public Object schimbaMotorul() {
        return new AdapteeAbilitatileAutospecialistului().punMotorV8();
    }

    public Object schimbaCuloarea() {
        return new AdapteeAbilitatileAutospecialistului().schimbCulearea_rosie();
    }
}
