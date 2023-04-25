package OP.Strategy;

import DataStore.DataStore;

public class IncreaseCF1 implements IncreaseCF {
    private DataStore d;

    public DataStore getDataStore(){
        return this.d;
    }

    public void setDataStore(DataStore d){
        this.d = d;
    }

    public void IncreaseCF(){
        float cf = d.getFloatCF();
        float v = d.getTempFloat_v();
        d.setFloatCF(cf+v);
        System.out.println("IncreaseCF1: You have " + d.getFloatCF() + " funds available.\n");
    }
}