package OP.Strategy;

import DataStore.DataStore;

public class DisposeAdditive2 implements DisposeAdditive{
    private DataStore d;
    public DataStore getDataStore(){
        return this.d;
    }

    public void setDataStore(DataStore d){
        this.d = d;
    }

    public void DisposeAdditive(int AL[]) {
        // AL[0] = SUGAR, AL[1] = CREAM
        if (AL[0] == 1) {
            System.out.println("Sugar added to drink.\n");
        }
        if (AL[1] == 1){
            System.out.println("Cream added to drink.\n");
        }
    }
}