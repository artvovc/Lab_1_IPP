package com.lab2ipp.proxy;

/**
 * Created by Artemie on 24.09.2016.
 */
public class RealConduceAutomobilul implements ConduceAutomobilul {
    @Override
    public Object get() {
        return "conduc";
    }
}
