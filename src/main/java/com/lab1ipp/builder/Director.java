package com.lab1ipp.builder;

import com.lab1ipp.tipuri.transport.terestru.Automobil;
/**
 * Created by Artemie on 11.09.2016.
 */
public class Director {
  private AutomobilAbstractBuilder automobilAbstractBuilder;
  
  public void setConstructorulAutomobilului(AutomobilAbstractBuilder automobilAbstractBuilder) {
    this.automobilAbstractBuilder = automobilAbstractBuilder;
  }
  
  public Automobil getAutomobil() {
    return automobilAbstractBuilder.getAutomobil();
  }
  
  public void construiesteAutomobilul(String culoarea, String motorina, String ferestre) {
    automobilAbstractBuilder.buildSetCuloarea(culoarea);
    automobilAbstractBuilder.buildSetMotorina(motorina);
    automobilAbstractBuilder.buildSetFerestre(ferestre);
  }
}