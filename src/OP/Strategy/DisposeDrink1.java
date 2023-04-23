package OP.Strategy;

import DataStore.DataStore;

public class DisposeDrink1 implements DisposeDrink {
    private DataStore d;

    public DataStore getDataStore() {
        return this.d;
    }

    public void setDataStore(DataStore d) {
        this.d = d;
    }

    public void DisposeDrink(int d) {
        if (d == 0) {
            System.out.println("Dispose tea.\n");
        }
        if (d == 1) {
            System.out.println("Dispose latte.\n");
        }
    }
}