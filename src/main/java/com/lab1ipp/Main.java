package com.lab1ipp;

import com.lab1ipp.exterior.IRoata;
import com.lab1ipp.exterior.RoataDeVara;
import com.lab1ipp.exterior.RoataFactory;
import com.lab1ipp.internal.MotorFactory;
import com.lab1ipp.tipuri.transport.AbstractTransport;
import com.lab1ipp.tipuri.transport.TransportProducator;
import com.lab1ipp.tipuri.transport.terestru.Automobil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artemie on 11.09.2016.
 */
public class Main {
    public static void main(String[] args) {

        AbstractTransport at = TransportProducator.getFactory("terestru");
        TransportulPerfect.getInstance().setITransport(at.getTransportTerestru("automobil"));

        MotorFactory motorFactory = new MotorFactory();
        TransportulPerfect.getInstance().getITransport().setIMotor(motorFactory.getMotor("ardere"));


        IRoata roata = new RoataDeVara(200);
        RoataFactory roataFactory = new RoataFactory();

        List<IRoata> roti = new ArrayList<IRoata>();
        for (int repeat = 0 ; repeat<TransportulPerfect.getInstance().getITransport().getNrRoti() ; repeat++){
        roti.add(roataFactory.getClone(roata));
        }
        TransportulPerfect.getInstance().getITransport().setRoti(roti);


        System.out.println(TransportulPerfect.getInstance());
        for (IRoata iRoata : TransportulPerfect.getInstance().getITransport().getRoti()) {
            System.out.println(iRoata.getDimensiunea());
        }
    }
}
