package com.lab2ipp.bridge;

/**
 * Created by Artemie on 24.09.2016.
 */
public abstract class AbstractionAutomobil {
    private ImplementatorMarkaAutomobil implementatorMarkaAutomobil;

    public AbstractionAutomobil(ImplementatorMarkaAutomobil implementatorMarkaAutomobil) {
        this.implementatorMarkaAutomobil = implementatorMarkaAutomobil;
    }

    public abstract Object getMarka();

    public ImplementatorMarkaAutomobil getImplementatorMarkaAutomobil(){return this.implementatorMarkaAutomobil;}
}
