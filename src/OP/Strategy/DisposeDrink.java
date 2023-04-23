package OP.Strategy;

import DataStore.*;

public interface DisposeDrink {
    DataStore getDataStore();

    void setDataStore(DataStore d);

    void DisposeDrink(int d);
}