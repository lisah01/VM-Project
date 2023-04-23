package OP.Strategy;

import DataStore.*;

public interface ReturnCoins {
    DataStore getDataStore();

    void setDataStore(DataStore d);

    void ReturnCoins();
}
