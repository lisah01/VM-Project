package OP.Strategy;

import DataStore.DataStore;

public class StorePrice2 implements StorePrice {
    private DataStore d;

    public DataStore getDataStore(){
        return d;
    }

    public void setDataStore(DataStore d){
        this.d = d;
    }

    public void StorePrice(){
        float price = d.getTemp_p();
        d.setPrice(price);
        System.out.println("StorePrice2: PRICE SET TO " + d.getPrice());
    }
}
