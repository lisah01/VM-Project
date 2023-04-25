package OP.Strategy;

import DataStore.DataStore;

public class ZeroCF2 implements ZeroCF {
    private DataStore d;

    public DataStore getDataStore(){
        return this.d;
    }

    public void setDataStore(DataStore d){
        this.d = d;
    }

    public void ZeroCF(){
        d.setIntCF(0);
        System.out.println("ZeroCF2: No funds available.\n");
    }
}