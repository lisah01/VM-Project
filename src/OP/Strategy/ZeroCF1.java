package OP.Strategy;

import DataStore.DataStore;

public class ZeroCF1 implements ZeroCF {
    private DataStore d;

    public DataStore getDataStore(){
        return this.d;
    }

    public void setDataStore(DataStore d){
        this.d = d;
    }

    public void ZeroCF(){
        d.setFloatCF(0);
        System.out.println("ZeroCF1: No funds available.\n");
    }
}