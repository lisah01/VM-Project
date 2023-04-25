package OP.Strategy;

import DataStore.DataStore;

public class DisposeDrink2 implements DisposeDrink{
    private DataStore d;
    public DataStore getDataStore(){
        return this.d;
    }

    public void setDataStore(DataStore d){
        this.d = d;
    }

    public void DisposeDrink(int d) {
        if (d == 0) {
            System.out.println("DISPOSE A CUP OF COFFEE.\n");
        }
    }
}