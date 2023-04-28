package OP_Strategy.Strategy;

import DataStore.DataStore;

public class StorePrice2 implements StorePrice {
    public void StorePrice(DataStore d){
        System.out.println("***StorePrice2->StorePrice(DS d)***");
        d.setPrice(d.getTemp_p());
        System.out.println("PRICE SET TO " + d.getPrice());
    }
}
