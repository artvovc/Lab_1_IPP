package com.lab2ipp.proxy;

/**
 * Created by Artemie on 24.09.2016.
 */
public class ProxyConduce implements ConduceAutomobilul {
    private Boolean isEmpty = false;

    public ProxyConduce setIsEmpty(Boolean isEmpty){this.isEmpty = isEmpty;return this;}

    @Override
    public Object get() {
        if(isEmpty) return "nu poti conduce, nu ai motorina";
        return new RealConduceAutomobilul().get();
    }
}
