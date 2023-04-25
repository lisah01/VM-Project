package OP.Strategy;

import DataStore.DataStore;

public class IncreaseCF2 implements IncreaseCF {
    private DataStore d;

    public DataStore getDataStore(){
        return this.d;
    }

    public void setDataStore(DataStore d){
        this.d = d;
    }

    public void IncreaseCF(){
        int cf = d.getIntCF();
        int v = d.getTempInt_v();
        d.setIntCF(cf+v);
        System.out.println("IncreaseCF2: You have " + d.getIntCF() + " funds available.\n");
    }
}