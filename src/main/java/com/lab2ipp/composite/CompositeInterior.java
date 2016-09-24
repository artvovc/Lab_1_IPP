package com.lab2ipp.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artemie on 24.09.2016.
 */
public class CompositeInterior implements ComponentInterior {

    private List<ComponentInterior> componentInteriorList = new ArrayList<ComponentInterior>();

    public ComponentInterior addComponent(List<ComponentInterior> componentInteriorList){
        this.componentInteriorList.addAll(componentInteriorList);
        return this;
    }

    public Object get() {
        System.out.print("Componentele interiorului: ");
        this.componentInteriorList.forEach(componentInterior -> System.out.print(componentInterior.get()+" "));
        return "";
    }
}
