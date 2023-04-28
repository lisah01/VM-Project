package OP_Strategy.Strategy;

import DataStore.DataStore;

public class IncreaseCF1 implements IncreaseCF {
    public void IncreaseCF(DataStore d){
        System.out.println("***IncreaseCF1->IncreaseCF(DS d)***");
        float cf = d.getFloatCF();
        float v = d.getTempFloat_v();
        d.setFloatCF(cf + v);
        System.out.println(d.getFloatCF() + " coins available.");
    }
}