package OP.Strategy;

import DataStore.DataStore;

public class ReturnCoins1 implements ReturnCoins {
    private DataStore d;

    public DataStore getDataStore(){
        return this.d;
    }

    public void setDataStore(DataStore d){
        this.d = d;
    }

    public void ReturnCoins(){
        System.out.println("Returning coins.\n");
        d.setFloatCF(0);
    }
}