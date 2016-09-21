package com.lab1ipp.tipuri.transport;

import com.lab1ipp.exterior.IRoata;
import com.lab1ipp.internal.IMotor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artemie on 11.09.2016.
 */
public abstract class AbstractComponente {

    private IMotor IMotor;

    public void setIMotor(IMotor iMotor) {
        this.IMotor = iMotor;
    }

    public IMotor getIMotor(){
        return this.IMotor;
    }

    private List<IRoata> roti;

    public void setRoti(List<IRoata> roti){ this.roti = new ArrayList<IRoata>(roti);}

    public List<IRoata> getRoti(){
        return this.roti;
    }
}
