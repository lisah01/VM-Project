package OP.Strategy;

import DataStore.DataStore;

public class ReturnCoins2 implements ReturnCoins {
    private DataStore d;

    public DataStore getDataStore(){
        return this.d;
    }

    public void setDataStore(DataStore d){
        this.d = d;
    }

    public void ReturnCoins(){
        System.out.println("ReturnCoins2: Returning coins.\n");
        d.setIntCF(0);
    }
}