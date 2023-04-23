package OP.Strategy;

import DataStore.DataStore;

public class DisposeAdditive1 implements DisposeAdditive{
    private DataStore d;
    public DataStore getDataStore(){
        return this.d;
    }

    public void setDataStore(DataStore d){
        this.d = d;
    }

    public void DisposeAdditive(int AL[]) {
        if (AL[0] == 1) {
            System.out.println("Sugar added to drink.\n");
        }
    }
}