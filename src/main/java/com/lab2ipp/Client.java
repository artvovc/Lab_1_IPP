package com.lab2ipp;

import com.lab2ipp.adapter.AdapterAutospecialistSpecificat;
import com.lab2ipp.adapter.TargetAutospecialistul;
import com.lab2ipp.bridge.AbstractionAutomobil;
import com.lab2ipp.bridge.ConcreteImplementatorDacia;
import com.lab2ipp.bridge.RefinedAbstractionAutomobil;
import com.lab2ipp.composite.ComponentInterior;
import com.lab2ipp.composite.CompositeInterior;
import com.lab2ipp.composite.LeafScaun;
import com.lab2ipp.composite.LeafVolan;
import com.lab2ipp.facade.FacadeSuportTehnic;
import com.lab2ipp.proxy.ConduceAutomobilul;
import com.lab2ipp.proxy.ProxyConduce;

import java.util.Arrays;

/**
 * Created by Artemie on 24.09.2016.
 */
public class Client {
    public static void main(String[] args) {
        /**
         * ADAPTER
         */
        TargetAutospecialistul targetAutospecialistul = new AdapterAutospecialistSpecificat();
        System.out.println("Motorul: " + targetAutospecialistul.schimbaMotorul() + " Culoarea: " + targetAutospecialistul.schimbaCuloarea());

        /**
         * BRIDGE
         */
        AbstractionAutomobil abstractionAutomobil = new RefinedAbstractionAutomobil(new ConcreteImplementatorDacia());
        System.out.println("Automobilul: " + abstractionAutomobil.getMarka());

        /**
         * COMPOSITE
         */
        ComponentInterior componentInterior = new CompositeInterior().addComponent(Arrays.asList(new LeafVolan(), new LeafScaun()));
        System.out.println(componentInterior.get());

        /**
         * FACADE
         */
        FacadeSuportTehnic facadeSuportTehnic = new FacadeSuportTehnic();
        if(facadeSuportTehnic.trecut()) System.out.println("Automobilul a trecut suportul tehnic.");

        /**
         * PROXY
         */
        ConduceAutomobilul conduceAutomobilul = new ProxyConduce().setIsEmpty(true);
        System.out.println("Conduc automobilul: " + conduceAutomobilul.get());

    }
}
