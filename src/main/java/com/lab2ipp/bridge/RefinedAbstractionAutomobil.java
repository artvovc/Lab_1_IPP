package com.lab2ipp.bridge;

/**
 * Created by Artemie on 24.09.2016.
 */
public class RefinedAbstractionAutomobil extends AbstractionAutomobil {

    public RefinedAbstractionAutomobil(ImplementatorMarkaAutomobil implementatorMarkaAutomobil) {
        super(implementatorMarkaAutomobil);
    }

    public Object getMarka() {
        return this.getImplementatorMarkaAutomobil().getMarkaAutomobil();
    }
}
