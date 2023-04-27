package OP.Strategy;

import DataStore.DataStore;

public class DisposeAdditive1 implements DisposeAdditive{
    public void DisposeAdditive(int AL[]) {
        if (AL[1] == 1) {
            System.out.println("DISPOSE SUGAR (DisposeAdditive1 class)");
        }
    }
}