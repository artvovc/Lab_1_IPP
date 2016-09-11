package com.lab1ipp.tipuri.transport;

import com.lab1ipp.exterior.IRoata;
import com.lab1ipp.internal.IMotor;

import java.util.List;

/**
 * Created by Artemie on 11.09.2016.
 */
public interface ITransport {
    public Integer getViteza();
    public void setIMotor(IMotor IMotor);
    public IMotor getIMotor();
    public void setRoti(List<IRoata> roti);
    public List<IRoata> getRoti();
    public Integer getNrRoti();
}
