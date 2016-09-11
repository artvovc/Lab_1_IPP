package com.lab1ipp.internal;

/**
 * Created by Artemie on 11.09.2016.
 */
public class MotorFactory {
    public IMotor getMotor(String motor){
        if(motor.equals("ardere"))return new ArdereInterna();
        if(motor.equals("electronic"))return new Electric();
        return null;
    }
}
