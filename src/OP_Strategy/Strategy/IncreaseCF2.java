package OP_Strategy.Strategy;

import DataStore.DataStore;

public class IncreaseCF2 implements IncreaseCF {
    public void IncreaseCF(DataStore d){
        System.out.println("***IncreaseCF2->IncreaseCF(d)***");
        int cf = d.getIntCF();
        int v = d.getTempInt_v();
        d.setIntCF(cf+v);
        System.out.println(d.getIntCF() + " coins available.");
    }
}