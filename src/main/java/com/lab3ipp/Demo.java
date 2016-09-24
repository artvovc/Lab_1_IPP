package com.lab3ipp;

import com.lab3ipp.iterator.Iterator;
import com.lab3ipp.iterator.Repository;
import com.lab3ipp.memento.Caretaker;
import com.lab3ipp.memento.Memento;
import com.lab3ipp.memento.OriginatorStareaAutomobilului;
import com.lab3ipp.observer.ConcreteObservableSistemaDeClimat;
import com.lab3ipp.observer.ConcreteObserverClimat;
import com.lab3ipp.state.ContextAutomobil;
import com.lab3ipp.state.StareaDeDeplasare;
import com.lab3ipp.state.StareaDeRepaus;
import com.lab3ipp.template.RidicaDealulCuBecicleta;
import com.lab3ipp.template.RidicaDealul;

/**
 * Created by Artemie on 24.09.2016.
 */
public class Demo {
    public static void main(String[] args) {
        /**
         * ITERATOR
         */
        Repository repository = new Repository();
        System.out.print("Marks:");
        for (Iterator iterator = repository.getIterator(); iterator.hasNext(); ) {
            String mark = (String) iterator.next();
            System.out.print(" " + mark);
        }
        System.out.println();
        /**
         * MEMENTO
         */
        OriginatorStareaAutomobilului originatorStareaAutomobilului = new OriginatorStareaAutomobilului();
        originatorStareaAutomobilului.setState("nou");
        Caretaker caretaker = new Caretaker();
        System.out.println("Starea automobilului: "+originatorStareaAutomobilului.getState());
        caretaker.setMemento(new Memento(originatorStareaAutomobilului.getState()));
        originatorStareaAutomobilului.setState("stricat");
        System.out.println("Starea automobilului: "+originatorStareaAutomobilului.getState());
        originatorStareaAutomobilului.restoreState(caretaker.getMemento());
        System.out.println("Starea automobilului: "+originatorStareaAutomobilului.getState());
        /**
         * OBSERVER
         */
        ConcreteObservableSistemaDeClimat concreteObservableSistemaDeClimat = new ConcreteObservableSistemaDeClimat();
        ConcreteObserverClimat concreteObserverClimat = new ConcreteObserverClimat(concreteObservableSistemaDeClimat);
        concreteObservableSistemaDeClimat.setparameters(3.05F,2.0F);
        System.out.println(concreteObserverClimat);
        concreteObservableSistemaDeClimat.setparameters(5.05F,10.0F);
        System.out.println(concreteObserverClimat);
        /**
         * STATE
         */
        ContextAutomobil contextAutomobil = new ContextAutomobil();
        new StareaDeDeplasare().doAction(contextAutomobil);
        new StareaDeRepaus().doAction(contextAutomobil);
        /**
         * TEMPLATE
         */
        RidicaDealul ridicaDealul = new RidicaDealulCuBecicleta();
        ridicaDealul.rezolv();
    }
}
