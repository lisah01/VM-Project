package OP_Strategy.Strategy;

import DataStore.DataStore;

public class ZeroCF1 implements ZeroCF {
    public void ZeroCF(DataStore d){
        System.out.println("***ZeroCF1->ZeroCF(DS d)***");
        d.setFloatCF(0);
        System.out.println("No funds available.\n");
    }
}