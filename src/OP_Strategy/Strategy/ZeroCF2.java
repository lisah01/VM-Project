package OP_Strategy.Strategy;

import DataStore.DataStore;

public class ZeroCF2 implements ZeroCF {
    public void ZeroCF(DataStore d){
        System.out.println("***ZeroCF2->ZeroCF(d)***");
        d.setFloatCF(0);
        System.out.println("No funds available.\n");
    }
}